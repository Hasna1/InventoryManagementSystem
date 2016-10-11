/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystemfinal.entity;

import java.util.Date;

/**
 *
 * @author hasna
 */
public class Product {
    
    private int id;
    private String productName,productCategory,costPrice,sellingPrice;
    private int quantityAvailable;
    private Date addedDate,modifiedDate;
    private boolean status;

    public Product() {
    }

    public Product(int id, String productName, String productCategory, String costPrice, String sellingPrice, int quantityAvailable, Date addedDate, Date modifiedDate, boolean status) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
        this.quantityAvailable = quantityAvailable;
        this.addedDate = addedDate;
        this.modifiedDate = modifiedDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", productName=" + productName + ", productCategory=" + productCategory + ", costPrice=" + costPrice + ", sellingPrice=" + sellingPrice + ", quantityAvailable=" + quantityAvailable + ", addedDate=" + addedDate + ", modifiedDate=" + modifiedDate + ", status=" + status + '}';
    }
    
    
}
