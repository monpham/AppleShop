package com.example.demo.repository;


import com.example.demo.entity.ProductPortfolioEntity;
import com.example.demo.entity.ProductsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Integer> {
    public ProductsEntity findById(int id);

    public List<ProductsEntity> findByProductPortfolioEntityId(int id);

    /*
        Optional<ProductsEntity> findById(Long id);*/
    public ProductsEntity findByNameproduct(String nameproducts);

    Page<ProductsEntity> findById(int id, Pageable pageable);

    Page<ProductsEntity> findByNameproduct(String nameproducts, Pageable pageable);

}



