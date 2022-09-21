package org.edu.tmf.tmf.services;

import lombok.extern.slf4j.Slf4j;
import org.edu.tmf.tmf.constants.ResourceInventoryConstants;
import org.edu.tmf.tmf.dto.PatchReservationState;
import org.edu.tmf.tmf.dto.ReservationDTO;
import org.edu.tmf.tmf.dto.ReservationRequest;
import org.edu.tmf.tmf.dto.ReservationResponse;
import org.edu.tmf.tmf.exceptions.ReservationException;
import org.edu.tmf.tmf.model.ObjectsEntity;
import org.edu.tmf.tmf.model.ParamsEntity;
import org.edu.tmf.tmf.model.RIReservationEntity;
import org.edu.tmf.tmf.model.enums.ReservationStatesEnum;
import org.edu.tmf.tmf.repositories.ObjectsEntityRepository;
import org.edu.tmf.tmf.repositories.ParamsEntityRepository;
import org.edu.tmf.tmf.repositories.RIReservationEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
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
        return objectsEntityRepository.getResourcesByTypeAndQuantity(objectTypeId, quantity);
    }

    private ObjectsEntity checkResource(final ReservationDTO reservationDTO) {
        final ObjectsEntity objectsEntity = objectsEntityRepository
                .findObjectsEntityByParentIdAndAndName(reservationDTO.getResourcePool(), reservationDTO.getResourceName());
        if (objectsEntity == null) {
            throw new ReservationException(reservationDTO);
        }
        ParamsEntity paramsEntity = paramsEntityRepository
                .findParamsEntityByObjectIdAndAndAttrId(objectsEntity.getObjectId(), ResourceInventoryConstants.STATUS_ATTR_ID);
        if (!paramsEntity.getListValueId().equals(ResourceInventoryConstants.AVAILABLE_LIST_VALUE_ID)) {
            throw new ReservationException(reservationDTO.getResourceName());
        }
        return objectsEntity;
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
        riReservationEntity.setState(ReservationStatesEnum.IN_PROGRESS);
        riReservationEntityRepository.save(riReservationEntity);
        response.setReservationId(riReservationEntity.getReservationId());

        return response;
    }

    public Long changeReservationState(final Long reservationId, final PatchReservationState state) {

        // toto: change reservation state

        return reservationId;
    }
}
