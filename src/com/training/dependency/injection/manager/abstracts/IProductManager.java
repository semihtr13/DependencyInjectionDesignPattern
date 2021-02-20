package com.training.dependency.injection.manager.abstracts;

import com.training.dependency.injection.entity.Product;

import java.util.List;

public interface IProductManager {
    List<Product> getAll();
    void add(Product product);
    void delete(Product product);
    void update(Product product);
}
