/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystemfinal.entity.dao.impl;

import com.leapfrog.inventorymanagementsystemfinal.constant.SQLConstant;
import com.leapfrog.inventorymanagementsystemfinal.entity.Product;
import com.leapfrog.inventorymanagementsystemfinal.entity.dao.ProductDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hasna
 */
@Repository(value = "ProductDAO")
public class ProductDAOImpl implements ProductDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Product p) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SQLConstant.PRODUCT_INSERT, new Object[]{
            p.getProductName(),
            p.getProductCategory(),
            p.getQuantityAvailable(),
            p.getCostPrice(),
            p.getSellingPrice()
           // p.getStatus()
    
    
    });
    }
  
     private Product mapData(ResultSet rs) throws SQLException{
     
              Product product = new Product();

                product.setId(rs.getInt("product_id"));
                product.setProductName(rs.getString("product_name"));
                product.setProductCategory(rs.getString("product_category"));
                product.setQuantityAvailable(rs.getInt("quantity_available"));
                product.setCostPrice(rs.getString("cost_price"));
                product.setSellingPrice(rs.getString("selling_price"));

                product.setAddedDate(rs.getDate("added_date"));
                product.setModifiedDate(rs.getDate("modified_date"));
                product.setStatus(rs.getBoolean("status"));
                return product;
     
     
     }
    @Override
    public List<Product> getAll() throws SQLException, ClassNotFoundException {
        return jdbcTemplate.query(SQLConstant.PRODUCT_GETALL, new RowMapper<Product>() {
            @Override
            public Product mapRow(ResultSet rs, int i) throws SQLException {
                return mapData(rs);
            }
        });
    }

    @Override
    public int update(Product p) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SQLConstant.PRODUCT_UPDATE, new Object[]{
            p.getProductName(),
            p.getProductCategory(),
            p.getQuantityAvailable(),
            p.getCostPrice(),
            p.getSellingPrice(),
            p.getModifiedDate(),
            p.getId()
           // p.getStatus()
    
    
    });
       
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        return jdbcTemplate.update(SQLConstant.PRODUCT_DELETE, new Object[]{id});
   
                }
                

    @Override
    public Product getById(int id) throws SQLException, ClassNotFoundException {
       return jdbcTemplate.queryForObject(SQLConstant.PRODUCT_GETById, new Object[]{id}, new RowMapper<Product>() {
           @Override
           public Product mapRow(ResultSet rs, int i) throws SQLException {
               return mapData(rs);
           }
       });
    }

}
