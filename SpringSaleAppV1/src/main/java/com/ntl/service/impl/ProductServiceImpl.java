/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntl.service.impl;

import com.ntl.pojo.Product;
import com.ntl.repository.ProductRepository;
import com.ntl.service.ProductService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
public class ProductServiceImpl implements ProductService{
  @Autowired
    private ProductRepository prodRepo;

    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.prodRepo.getProducts(params);
    }  
}
