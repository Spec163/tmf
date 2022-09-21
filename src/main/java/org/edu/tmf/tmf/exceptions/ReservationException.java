package org.edu.tmf.tmf.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.edu.tmf.tmf.dto.ReservationDTO;

@Slf4j
public class ReservationException extends RuntimeException {
    public ReservationException(final ReservationDTO reservationDTO) {
        super(String.format(
                "Failed to reserve resource %s by type=%s and resource pool=%s",
                reservationDTO.getResourceName(),
                reservationDTO.getResourceType(),
                reservationDTO.getResourcePool())
        );
    }

    public ReservationException(final String resourceName) {
        super(String.format("Failed to reserve resource %s, because current status is not available!", resourceName));
    }
}
