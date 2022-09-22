package org.edu.tmf.tmf.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ri_reservation")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class RIReservationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reservationId;

    private String state;

    @ManyToMany
    @JoinTable(
            name = "ri_reservation_items",
            joinColumns =  @JoinColumn(name = "reservation_id"),
            inverseJoinColumns = @JoinColumn(name = "object_id")
    )
    private List<ObjectsEntity> items = new ArrayList<>();

    public void addItem(ObjectsEntity objectsEntity) {
        this.items.add(objectsEntity);
    }
}
