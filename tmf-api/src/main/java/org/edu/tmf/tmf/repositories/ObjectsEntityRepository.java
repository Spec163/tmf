package org.edu.tmf.tmf.repositories;

import org.edu.tmf.tmf.entities.ObjectsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObjectsEntityRepository extends JpaRepository<ObjectsEntity, Long> {


    @Query(
        value = "select o.name from objects o " +
                "where o.object_type_id = ?1 and o.object_id in " +
                "(select p.object_id from params p where p.attr_id = 505 and p.list_value_id = 81) limit ?2",
        nativeQuery = true
    )
    List<String> getResourcesByTypeAndQuantity(Long objectTypeId, Integer quantity);

    ObjectsEntity findObjectsEntityByParentIdAndObjectTypeIdAndName(Long parentId, Long objectTypeId, String name);

    ObjectsEntity findObjectsEntityByObjectId(Long objectId);
}
