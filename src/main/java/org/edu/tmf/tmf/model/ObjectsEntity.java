package org.edu.tmf.tmf.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "objects")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    private Long objectTypeId;

    @Column(name = "name", nullable = false)
    private String name;
}
