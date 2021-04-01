package com.example.demo.entity;


import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "productportfolio")
public class ProductPortfolioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "portfolio")
    private String portfolio;

    @OneToMany(mappedBy = "productPortfolioEntity", fetch = FetchType.EAGER)
    private List<ProductsEntity> productsEntitys;

    public ProductPortfolioEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public List<ProductsEntity> getProductsEntitys() {
        return productsEntitys;
    }

    public void setProductsEntitys(List<ProductsEntity> productsEntitys) {
        this.productsEntitys = productsEntitys;
    }
}
