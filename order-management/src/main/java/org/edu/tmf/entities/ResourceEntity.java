package org.edu.tmf.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "resource_entity")
@Getter
@Setter
@ToString
public class ResourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long resourceId;

    @NotNull
    @Column(nullable = false)
    private Long objectId;

    @NotNull
    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private Long reservationId;

    @Builder
    public ResourceEntity(Long resourceId, Long objectId, String name, Long reservationId) {
        this.resourceId = resourceId;
        this.objectId = objectId;
        this.name = name;
        this.reservationId = reservationId;
    }

    public ResourceEntity() {
    }
}
