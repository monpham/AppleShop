package com.example.demo.entity;
/**
 *
 * @author TVD
 */

public class CartEntity {
    private ProductsEntity productsEntity;
    private int quantity;

    public CartEntity() {
    }

    public ProductsEntity getProductsEntity() {
        return productsEntity;
    }

    public void setProductsEntity(ProductsEntity productsEntity) {
        this.productsEntity = productsEntity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
