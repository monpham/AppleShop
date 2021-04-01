package com.example.demo.service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.TransactionEntity;

import java.util.List;

public interface OrdersService {
    public void newOrders(OrderEntity orderEntity);
    public List<OrderEntity> getOrderEntities();
    public List<OrderEntity> getIDTransaction(int id);
    public OrderEntity getFindbyViewdetails(int id);
}
