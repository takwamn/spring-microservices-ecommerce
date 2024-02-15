package com.programming.orderservice.controller;

import com.programming.orderservice.dto.OrderRequest;
import com.programming.orderservice.dto.OrderResponse;
import com.programming.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order/")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody OrderRequest orderRequest) {
        orderService.createOrder(orderRequest);
        return "OrderPlaced Successfully";
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderResponse> getAllOrders() {
        return orderService.getAllOrders();
    }

}