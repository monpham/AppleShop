package com.example.demo.service;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.ProductPortfolioEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface ProductPortfolioService {

    public List<ProductPortfolioEntity> ProductPortfolioEntityAll();


}
