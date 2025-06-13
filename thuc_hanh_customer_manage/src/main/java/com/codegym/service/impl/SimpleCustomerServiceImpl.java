package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class SimpleCustomerServiceImpl implements CustomerService {
    private static final List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Nguyen Khac Nhat", "nhat@codegym.vn", "Hà Nội"));
        customers.add(new Customer(2, "Dang Huy Hoa", "hoa.dang@codegym.vn", "Đà Nẵng"));
        customers.add(new Customer(3, "Le Thi Chau", "chau.le@codegym.vn", "Hà Nội"));
        customers.add(new Customer(4, "Nguyen Thuy Duong", "duong.nguyen@codegym.vn", "Sài Gòn"));
        customers.add(new Customer(5, "CodeGym", "codegym@codegym.vn", "Việt Nam"));
    }

    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Customer findById(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }
}
