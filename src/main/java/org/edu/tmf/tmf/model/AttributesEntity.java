package org.edu.tmf.tmf.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "attributes")
@Builder
public class AttributesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attrId;

    private Long parentId;
    private String name;

}
