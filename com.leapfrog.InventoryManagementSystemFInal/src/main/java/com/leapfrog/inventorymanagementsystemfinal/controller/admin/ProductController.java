/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.inventorymanagementsystemfinal.controller.admin;

import com.leapfrog.inventorymanagementsystemfinal.entity.Product;
import com.leapfrog.inventorymanagementsystemfinal.service.ProductService;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author hasna
 */

@Controller
@RequestMapping(value=" /admin/products ")
public class ProductController {
    
   @Autowired
    private ProductService productService;
   
   @RequestMapping(method= RequestMethod.GET)
   public @ResponseBody String index(){
       String content="";
       try{ 
       for(Product p:productService.getAll()){
          content +=p.toString();
       }
       
       return content;
       }catch(SQLException | ClassNotFoundException ex){
       
       
       }
       return "Error";
   
   }
    
}
