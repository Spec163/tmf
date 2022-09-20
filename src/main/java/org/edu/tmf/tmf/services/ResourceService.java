package org.edu.tmf.tmf.services;

import org.edu.tmf.tmf.model.ObjectsEntity;
import org.edu.tmf.tmf.repositories.ObjectsEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ResourceService {


    private final ObjectsEntityRepository objectsEntityRepository;

    @Autowired
    public ResourceService(ObjectsEntityRepository objectsEntityRepository) {
        this.objectsEntityRepository = objectsEntityRepository;
    }

    public List<ObjectsEntity> getResourcesByTMF639(final Long objectTypeId, final Integer quantity) {
        return objectsEntityRepository.getResourcesByTypeAndQuantity(objectTypeId, quantity);
    }
}
