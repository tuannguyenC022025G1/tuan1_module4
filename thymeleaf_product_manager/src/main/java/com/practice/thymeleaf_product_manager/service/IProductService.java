package com.practice.thymeleaf_product_manager.service;

import com.practice.productmanagement.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    void save(Product product);
    Product findById(Long id);
    void update(Long id, Product product);
    void delete(Long id);
    List<Product> findByName(String name);
}