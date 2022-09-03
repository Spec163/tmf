package org.edu.tmf.tmf.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class EntityDTO {

    private Long objectId;
    private String name;

}
