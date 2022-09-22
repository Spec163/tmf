package org.edu.tmf.tmf.dto;

import lombok.Data;
import lombok.ToString;
import org.edu.tmf.tmf.model.enums.ResourceTypesEnum;

@Data
@ToString
public class ReservationDTO {

    private ResourceTypesEnum resourceType;
    private Long resourcePool;
    private String resourceName;
}
