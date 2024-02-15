package com.programming.orderservice.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name="t_order_items")
@Builder
@Data
public class OrderLineItems {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;

}
