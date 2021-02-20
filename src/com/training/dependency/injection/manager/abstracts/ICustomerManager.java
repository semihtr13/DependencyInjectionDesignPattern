package com.training.dependency.injection.manager.abstracts;

import com.training.dependency.injection.entity.Customer;

import java.util.List;

public interface ICustomerManager {
    List<Customer> getAll();
    void add(Customer customer);
    void delete(Customer customer);
    void update(Customer customer);
}
