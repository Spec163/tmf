package org.edu.tmf.tmf.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "object_types")
@Builder
@ToString
public class ObjectTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long objectTypeId;

    private Long parentId;
    private String name;
}
