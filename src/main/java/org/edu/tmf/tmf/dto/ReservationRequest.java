package org.edu.tmf.tmf.dto;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class ReservationRequest {
    List<ReservationDTO> reservationItems;
}
