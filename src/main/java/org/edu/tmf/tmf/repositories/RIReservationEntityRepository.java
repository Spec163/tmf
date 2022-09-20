package org.edu.tmf.tmf.repositories;

import org.edu.tmf.tmf.model.RIReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RIReservationEntityRepository extends JpaRepository<RIReservationEntity, Long> {
}
