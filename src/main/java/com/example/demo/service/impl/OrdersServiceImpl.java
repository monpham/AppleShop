package com.example.demo.service.impl;


import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.ProductsEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrderRepository orderRepository;


    @Override
    public void newOrders(OrderEntity orderEntity) {
        orderRepository.save(orderEntity);
    }


    @Override
    public OrderEntity getFindbyViewdetails(int id) {
        OrderEntity orderEntity = orderRepository.findById(id);
        return orderEntity;
    }


    @Override
    public List<OrderEntity> getIDTransaction(int id) {
        return (List<OrderEntity>) orderRepository.findByTransactionEntityId(id);
    }
    @Override
    public List<OrderEntity> getOrderEntities(){
        return (List<OrderEntity>)orderRepository.findAll();
    }
}
