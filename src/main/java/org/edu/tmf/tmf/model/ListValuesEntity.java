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
@Table(name = "list_values")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ListValuesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_value_id")
    private Long listValueId;

    @Column(name = "list_value", nullable = false)
    private String listValue;

}
