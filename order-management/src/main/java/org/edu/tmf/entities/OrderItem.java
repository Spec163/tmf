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
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order_entity")
@Getter
@Setter
@ToString
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderItemId;

    @NotNull
    @Column(name = "order_item_name", nullable = false)
    private String orderItemName;

    @Column(name = "order_item_parameters")
    private String orderItemParameters;

    @Builder
    public OrderItem(Long orderItemId, String orderItemName, String orderItemParameters) {
        this.orderItemId = orderItemId;
        this.orderItemName = orderItemName;
        this.orderItemParameters = orderItemParameters;
    }

    public OrderItem() {
    }
}
