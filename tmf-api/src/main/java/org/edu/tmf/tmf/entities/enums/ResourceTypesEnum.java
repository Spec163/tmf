package org.edu.tmf.tmf.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum ResourceTypesEnum {
    mobilePhoneNumber(900L),
    fixedPhoneNumber(910L),
    pSim(600L),
    eSim(610L);

    @Getter
    private final Long value;
}
