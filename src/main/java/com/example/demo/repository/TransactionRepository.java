package com.example.demo.repository;


import com.example.demo.entity.OrderEntity;
import com.example.demo.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
    public TransactionEntity findById(int id);
    TransactionEntity findByPayment(double payment);
}
