package org.edu.tmf.tmf.entities;

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
@Data
@Table(name = "object_types")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ObjectTypesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "object_type_id")
    private Long objectTypeId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "name", nullable = false)
    private String name;
}
