package com.example.demo.service.impl;


import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.ProductPortfolioEntity;
import com.example.demo.entity.ProductsEntity;
import com.example.demo.entity.TransactionEntity;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public TransactionEntity newTransaction(TransactionEntity transactionEntity) {
       return transactionRepository.save(transactionEntity);
    }

    @Override
    public TransactionEntity getfintbyTransaction(int id) {
        TransactionEntity transactionEntity = transactionRepository.findById(id);
        return transactionEntity;
    }

    @Override
    public TransactionEntity findByPayment(double payment) {
        TransactionEntity transactionEntity = transactionRepository.findByPayment(payment);
        return transactionEntity;
    }

@Override
    public List<TransactionEntity> transactionEntities(){
        return (List<TransactionEntity>)transactionRepository.findAll();
    }
}
