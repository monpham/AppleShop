package com.example.demo.service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.ProductsEntity;
import com.example.demo.entity.TransactionEntity;

import java.util.List;

public interface TransactionService {
    public TransactionEntity newTransaction(TransactionEntity transactionEntity);
    public List<TransactionEntity> transactionEntities();
    public TransactionEntity getfintbyTransaction(int id);
   public TransactionEntity findByPayment(double payment);
}
