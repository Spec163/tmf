package org.edu.tmf.tmf.dto;

import lombok.Data;
import org.edu.tmf.tmf.model.enums.ReservationStatesEnum;

@Data
public class PatchReservationState {
    private ReservationStatesEnum reservationState;
}
