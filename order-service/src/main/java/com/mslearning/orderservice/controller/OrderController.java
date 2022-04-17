package com.mslearning.orderservice.controller;

import com.mslearning.orderservice.entity.OrderEntity;
import com.mslearning.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/saveOrder")
    public OrderEntity saveOrder(@RequestBody OrderEntity order){
        return orderService.saveOrder(order);
    }
}
