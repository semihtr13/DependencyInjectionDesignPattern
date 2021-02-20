package com.training.dependency.injection.manager.concrete;

import com.training.dependency.injection.manager.abstracts.ICustomerManager;
import com.training.dependency.injection.pattern.IRepository;
import com.training.dependency.injection.entity.Customer;

import java.util.List;

public class CustomerManager implements ICustomerManager {
    private IRepository repository;

    public CustomerManager(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Customer> getAll() {
        return repository.getAll();
    }

    @Override
    public void update(Customer customer) {
        repository.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(customer);
    }

    @Override
    public void add(Customer customer) {
        repository.add(customer);
    }
}
