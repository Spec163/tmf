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
@Table(name = "params")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class ParamsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "param_id")
    private Long paramId;

    @Column(name = "object_id", nullable = false)
    private Long objectId;
    @Column(name = "attr_id", nullable = false)
    private Long attrId;
    @Column(name = "list_value_id", nullable = false)
    private Long listValueId;
    @Column(name = "text")
    private String text;

}
