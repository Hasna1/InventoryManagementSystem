/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystemfinal.service.impl;

import com.leapfrog.inventorymanagementsystemfinal.entity.Product;
import com.leapfrog.inventorymanagementsystemfinal.entity.dao.ProductDAO;
import com.leapfrog.inventorymanagementsystemfinal.service.ProductService;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hasna
 */

@Service(value="ProductService")
public class ProductServiceImpl implements ProductService {

   
    @Autowired
    private ProductDAO productDAO;
    
    @Override
    public int insert(Product p) throws SQLException, ClassNotFoundException {
        return productDAO.insert(p);
    }

    @Override
    public List<Product> getAll() throws SQLException, ClassNotFoundException {
        return productDAO.getAll();
    }

    @Override
    public int update(Product p) throws SQLException, ClassNotFoundException {
        return productDAO.update(p);
    }

    @Override
    public int delete(int id) throws SQLException, ClassNotFoundException {
        return productDAO.delete(id);
    }

    @Override
    public Product getById(int id) throws SQLException, ClassNotFoundException {
        return productDAO.getById(id);
    }
    
}
