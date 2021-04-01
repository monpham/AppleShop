package com.example.demo.service;

import com.example.demo.entity.AccountEntity;
import com.example.demo.entity.ProductsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface ProductsService {
 public List<ProductsEntity> getProductsEntities();
public ProductsEntity getfindById(int id);
public List<ProductsEntity> getIdProductsPortfolio(int id);
public void newProducts(ProductsEntity productsEntity);
public void deleteProducts(ProductsEntity productsEntity);
public ProductsEntity editProducts(int id);

 /*     Optional<ProductsEntity> findById(Long id);*/
/*public List<ProductsEntity> getIdProducts();*/
/*public List<ProductsEntity> getIdPortfolio(int id);*/
///*    public List<ProductsEntity> getAllProductsList();*/
//
//    public List<ProductsEntity> getProductsEntities();
//     public ProductsEntity findById(int id);
}
