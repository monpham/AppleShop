package com.example.demo.service.impl;

import com.example.demo.entity.ProductPortfolioEntity;
import com.example.demo.repository.AccountRepository;
import com.example.demo.repository.ProductPortfolioRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.ProductPortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductPortfolioServiceImpl implements ProductPortfolioService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private ProductPortfolioRepository productPortfolioRepository;


    public List<ProductPortfolioEntity> ProductPortfolioEntityAll(){
        return (List<ProductPortfolioEntity>)productPortfolioRepository.findAll();
    }
}
