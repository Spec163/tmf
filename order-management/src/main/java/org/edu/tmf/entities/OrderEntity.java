package org.edu.tmf.entities;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_entity")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @NotNull
    private String orderName;

    @OneToMany(fetch = FetchType.LAZY)
    @NotNull
    private List<ResourceEntity> resources;

    @NotNull
    @Min(1)
    @Column(nullable = false)
    private Integer price;

    @OneToMany(fetch = FetchType.LAZY)
    @NotNull
    private List<OrderItem> orderItems;

    public OrderEntity() {
    }
}
