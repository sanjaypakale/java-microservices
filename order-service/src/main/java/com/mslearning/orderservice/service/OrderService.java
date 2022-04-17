package com.mslearning.orderservice.service;

import com.mslearning.orderservice.entity.OrderEntity;
import com.mslearning.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderEntity saveOrder(OrderEntity order){
       return orderRepository.save(order);
    }
}
