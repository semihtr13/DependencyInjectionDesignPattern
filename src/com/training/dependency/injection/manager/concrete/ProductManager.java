package com.training.dependency.injection.manager.concrete;

import com.training.dependency.injection.entity.Product;
import com.training.dependency.injection.manager.abstracts.IProductManager;
import com.training.dependency.injection.pattern.IRepository;

import java.util.List;

public class ProductManager implements IProductManager {

    private IRepository repository;

    public ProductManager(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> getAll() {
        return repository.getAll();
    }

    @Override
    public void add(Product product) {
        repository.add(product);
    }

    @Override
    public void delete(Product product) {
        repository.delete(product);
    }

    @Override
    public void update(Product product) {
        repository.update(product);
    }
}
