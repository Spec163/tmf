package org.edu.tmf.tmf.repositories;

import org.edu.tmf.tmf.model.ParamsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParamsEntityRepository extends JpaRepository<ParamsEntity, Long> {

    ParamsEntity findParamsEntityByObjectIdAndAndAttrId(Long objectId, Long attrId);
}
