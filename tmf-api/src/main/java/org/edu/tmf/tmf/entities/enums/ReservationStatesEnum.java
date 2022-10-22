package org.edu.tmf.tmf.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ReservationStatesEnum {
    IN_PROGRESS("IN_PROGRESS"), COMPLETED("COMPLETED"), CANCELLED("CANCELLED");

    @Getter
    private final String value;
}
