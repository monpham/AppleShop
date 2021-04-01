
package com.example.demo.entity;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "products")
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nameproduct")
    private String nameproduct;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "descriptionimges")
    private String descriptionimges;
    @Column(name = "images")
    private String images;
    @Column(name = "code")
    private String code;
    @Column(name = "sale")
    private int sale;



    @ManyToOne
    @JoinColumn(name = "id_portfolio")
    private ProductPortfolioEntity productPortfolioEntity;



    public ProductsEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameproduct() {
        return nameproduct;
    }

    public void setNameproduct(String nameproduct) {
        this.nameproduct = nameproduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptionimges() {
        return descriptionimges;
    }

    public void setDescriptionimges(String descriptionimges) {
        this.descriptionimges = descriptionimges;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ProductPortfolioEntity getProductPortfolioEntity() {
        return productPortfolioEntity;
    }

    public void setProductPortfolioEntity(ProductPortfolioEntity productPortfolioEntity) {
        this.productPortfolioEntity = productPortfolioEntity;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }


}

