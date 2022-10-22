package org.edu.tmf.tmf.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ReservationResponse {

    private Long reservationId;

    private List<EntityDTO> reservedResources = new ArrayList<>();

    public void addEntityDTO(final Long id, final String name) {
        this.reservedResources.add(new EntityDTO(id, name));
    }
}
