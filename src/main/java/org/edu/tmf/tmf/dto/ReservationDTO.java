package org.edu.tmf.tmf.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ReservationDTO {

    private String resourceType;
    private Long resourcePool;
    private String resourceName;
}
