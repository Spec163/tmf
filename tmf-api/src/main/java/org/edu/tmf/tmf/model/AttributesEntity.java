package org.edu.tmf.tmf.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attributes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttributesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attrId;

    private Long parentId;
    private String name;

}
