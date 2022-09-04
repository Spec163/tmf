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
@Table(name = "list_values")
@Builder
@ToString
public class ListValuesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long listValueId;

    private String value;

}
