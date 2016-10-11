/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystemfinal.constant;

/**
 *
 * @author hasna
 */
public class SQLConstant {

    public final static String PRODUCT_GETALL = " SELECT * FROM " + TableConstant.TABLE_PRODUCT;
    public final static String PRODUCT_GETById = " SELECT * FROM " + TableConstant.TABLE_PRODUCT + " WHERE id=? ";
    public final static String PRODUCT_INSERT = "INSERT INTO " + TableConstant.TABLE_PRODUCT
            + " (product_name,product_category,quantity_available,cost_price,selling_price,status) VALUES (?,?,?,?,?,?)";
    public final static String PRODUCT_UPDATE = "UPDATE " + TableConstant.TABLE_PRODUCT
            + " SET product_name=?,product_category=?,quantity_available=?,cost_price=?,selling_price=?,modified_datestatus=? WHERE id=?";
    public final static String PRODUCT_DELETE = " DELETE FROM " + TableConstant.TABLE_PRODUCT + "WHERE id=?";

}
