package com.example.demo.service.impl;


import com.example.demo.entity.ProductsEntity;
import com.example.demo.repository.ProductsRepository;
import com.example.demo.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsServiceImpl implements ProductsService {
    @Autowired
    ProductsRepository productsRepository;

    @Override
    public List<ProductsEntity> getProductsEntities() {
        return (List<ProductsEntity>) productsRepository.findAll();
    }

    @Override
    public ProductsEntity getfindById(int id) {
        ProductsEntity productsEntity = productsRepository.findById(id);
        return productsEntity;
    }


    public void deleteProducts(ProductsEntity productsEntity) {
        productsRepository.delete(productsEntity);
    }

    @Override
    public List<ProductsEntity> getIdProductsPortfolio(int id) {
        return (List<ProductsEntity>) productsRepository.findByProductPortfolioEntityId(id);
    }


    @Override
    public ProductsEntity editProducts(int id) {
        return productsRepository.findById(id);
    }


    @Override
    public void newProducts(ProductsEntity productsEntity) {
        productsRepository.save(productsEntity);
    }

/*    @Override
    public Optional<ProductsEntity> findById(Long id) {
        return productsRepository.findById(id);
    }*/
}



/*    @Override
    public List<ProductsEntity> getIdProducts(){
        return (List<ProductsEntity>) productsRepository.findAllById_portfolio();
    }*/
/*
    @Override
    public List<ProductsEntity> getIdPortfolio(int id){
        return (List<ProductsEntity>) productsRepository.findById_portfolio(id);
    }*/

/*
    @Override
    public List<ProductsEntity> getProductsEntities(){
        return (List<ProductsEntity>) productsRepository.findById();
    }*/


