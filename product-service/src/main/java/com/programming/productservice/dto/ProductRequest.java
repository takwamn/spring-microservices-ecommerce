package com.programming.productservice.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;


@Builder
@Data
public class ProductRequest {

    private String name;
    private String description;
    private BigDecimal price;
}
