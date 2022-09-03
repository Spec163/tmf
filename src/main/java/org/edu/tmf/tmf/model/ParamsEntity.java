package org.edu.tmf.tmf.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@Builder
@ToString
public class ParamsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paramId;

    private Long objectId;
    private Long attrId;
    private Long listValueId;
    private Long value;

}
