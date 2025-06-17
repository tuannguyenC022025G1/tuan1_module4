package com.practice.thymeleaf_product_manager.service;

import com.practice.productmanagement.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService implements IProductService {
    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        if (product.getId() == null) {
            product.setId(nextId++);
        }
        products.add(product);
    }

    @Override
    public Product findById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void update(Long id, Product product) {
        Product existing = findById(id);
        if (existing != null) {
            existing.setName(product.getName());
            existing.setPrice(product.getPrice());
            existing.setDescription(product.getDescription());
            existing.setManufacturer(product.getManufacturer());
        }
    }

    @Override
    public void delete(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
}