package com.example.demo.repository;


import com.example.demo.entity.ProductPortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductPortfolioRepository extends JpaRepository<ProductPortfolioEntity, Integer> {
    /*    public List<ProductPortfolioEntity> findById();*/

}
