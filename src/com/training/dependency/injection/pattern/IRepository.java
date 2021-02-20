package com.training.dependency.injection.pattern;

import com.training.dependency.injection.entity.Entity;

import java.util.List;

public interface IRepository<T extends Entity> {
    List<T> getAll();
    void add(T t);
    void delete(T t);
    void update(T t);

}
