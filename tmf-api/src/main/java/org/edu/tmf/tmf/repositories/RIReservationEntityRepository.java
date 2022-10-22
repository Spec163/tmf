package org.edu.tmf.tmf.repositories;

import org.edu.tmf.tmf.entities.RIReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface RIReservationEntityRepository extends JpaRepository<RIReservationEntity, Long> {

    List<RIReservationEntity> findRIReservationEntitiesByStateAndCreationDateBefore(String state, Date date);
}
