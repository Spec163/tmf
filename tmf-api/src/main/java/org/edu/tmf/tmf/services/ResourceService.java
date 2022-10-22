package org.edu.tmf.tmf.services;

import lombok.extern.slf4j.Slf4j;
import org.edu.tmf.tmf.constants.RIConstants;
import org.edu.tmf.tmf.dto.ReservationDTO;
import org.edu.tmf.tmf.dto.ReservationRequest;
import org.edu.tmf.tmf.dto.ReservationResponse;
import org.edu.tmf.tmf.exceptions.ChangeResourceReservationException;
import org.edu.tmf.tmf.exceptions.GetResourceException;
import org.edu.tmf.tmf.exceptions.ReservationException;
import org.edu.tmf.tmf.entities.ObjectsEntity;
import org.edu.tmf.tmf.entities.ParamsEntity;
import org.edu.tmf.tmf.entities.RIReservationEntity;
import org.edu.tmf.tmf.entities.enums.ReservationStatesEnum;
import org.edu.tmf.tmf.repositories.ObjectsEntityRepository;
import org.edu.tmf.tmf.repositories.ParamsEntityRepository;
import org.edu.tmf.tmf.repositories.RIReservationEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ResourceService {


    private final ObjectsEntityRepository objectsEntityRepository;
    private final ParamsEntityRepository paramsEntityRepository;
    private final RIReservationEntityRepository riReservationEntityRepository;

    @Autowired
    public ResourceService(
            final ObjectsEntityRepository objectsEntityRepository,
            final ParamsEntityRepository paramsEntityRepository,
            final RIReservationEntityRepository riReservationEntityRepository
    ) {
        this.objectsEntityRepository = objectsEntityRepository;
        this.paramsEntityRepository = paramsEntityRepository;
        this.riReservationEntityRepository = riReservationEntityRepository;
    }

    public List<String> getResourcesByTMF639(final Long objectTypeId, final Integer quantity) {
        try {
            return objectsEntityRepository.getResourcesByTypeAndQuantity(objectTypeId, quantity);
        } catch (Exception e) {
            throw new GetResourceException(objectTypeId, e.getCause());
        }
    }

    private ObjectsEntity checkResource(final ReservationDTO reservationDTO) {
        final ObjectsEntity objectsEntity = objectsEntityRepository
                .findObjectsEntityByParentIdAndObjectTypeIdAndName(
                        reservationDTO.getResourcePool(),
                        reservationDTO.getResourceType().getValue(),
                        reservationDTO.getResourceName());
        if (objectsEntity == null) {
            throw new ReservationException(reservationDTO);
        }
        ParamsEntity paramsEntity = paramsEntityRepository
                .findParamsEntityByObjectIdAndAndAttrId(objectsEntity.getObjectId(), RIConstants.STATUS_ATTR_ID);
        if (!paramsEntity.getListValueId().equals(RIConstants.AVAILABLE_LIST_VALUE_ID)) {
            throw new ReservationException(reservationDTO.getResourceName());
        }
        return objectsEntity;
    }

    private ParamsEntity changeParamListValue(final Long objectId, final Long attrId, final Long listValueId) {
        final ParamsEntity paramsEntity = this.paramsEntityRepository.findParamsEntityByObjectIdAndAndAttrId(objectId, attrId);
        paramsEntity.setListValueId(listValueId);
        return this.paramsEntityRepository.save(paramsEntity);
    }

    public ReservationResponse reserveResourceByTMF641(final ReservationRequest reservationRequest) {
        final RIReservationEntity riReservationEntity = new RIReservationEntity();
        final ReservationResponse response = new ReservationResponse();
        reservationRequest
                .getReservationItems()
                .forEach(item -> {
                    ObjectsEntity object = checkResource(item);
                    riReservationEntity.addItem(object);
                    response.addEntityDTO(object.getObjectId(), object.getName());
                    log.debug("Object {} added to reservation.", object);
                });
        riReservationEntity.setState(ReservationStatesEnum.IN_PROGRESS.getValue());
        riReservationEntity.setCreationDate(new Date());
        riReservationEntityRepository.save(riReservationEntity);
        response.setReservationId(riReservationEntity.getReservationId());

        response
                .getReservedResources()
                .forEach(resource -> changeParamListValue(
                        resource.getObjectId(), RIConstants.STATUS_ATTR_ID, RIConstants.RESERVED_LIST_VALUE_ID));

        return response;
    }
////todo: added change reservation items???
//    public ReservationResponse changeReservationItems(final Long reservationId, ) {
//
//    }

    public Long changeReservationState(final Long reservationId, final ReservationStatesEnum state) {
        final RIReservationEntity riReservationEntity = riReservationEntityRepository
                .findById(reservationId)
                .orElseThrow(() -> new ChangeResourceReservationException(reservationId));

        if (!riReservationEntity.getState().equals(ReservationStatesEnum.IN_PROGRESS.getValue())) {
            throw new ChangeResourceReservationException();
        }

        riReservationEntity.setState(state.getValue());
        riReservationEntityRepository.save(riReservationEntity);
        riReservationEntity
                .getItems()
                .forEach(resource -> changeParamListValue(
                        resource.getObjectId(),
                        RIConstants.STATUS_ATTR_ID,
                        state == ReservationStatesEnum.COMPLETED ?
                                RIConstants.IN_USE_LIST_VALUE_ID : RIConstants.AVAILABLE_LIST_VALUE_ID)
                );
        return reservationId;
    }

    @Scheduled(fixedRate = 60000)
    public void releaseOldReservationsByBackgroundJob() {
        final List<RIReservationEntity> oldReservations =
                this.riReservationEntityRepository.findRIReservationEntitiesByStateAndCreationDateBefore(
                        ReservationStatesEnum.IN_PROGRESS.getValue(),
                        new Date(System.currentTimeMillis() - 3600 * 1000)
                );
        if (oldReservations.isEmpty()) {
            log.info("Old reservations not found!");
        } else {
            log.info("Old reservations: {}", oldReservations.toString());
            oldReservations.forEach(r -> this.changeReservationState(r.getReservationId(), ReservationStatesEnum.CANCELLED));
        }
    }
}
