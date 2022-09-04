package org.edu.tmf.tmf.model;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "objects")
@Builder
@ToString
public class ObjectsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_id")
    private Long objectId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "object_type_id", nullable = false)
    private String objectTypeId;

    @Column(name = "name", nullable = false)
    private String name;
}
