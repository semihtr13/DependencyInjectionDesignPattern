package com.training.dependency.injection.pattern;

import com.training.dependency.injection.entity.Entity;

import java.util.List;

public abstract class BaseRepository<T extends Entity> implements IRepository<T> {
    @Override
    public List<T> getAll() {
        System.out.println("listed");
        return null;
    }

    @Override
    public void add(T t) {
        System.out.println("added");
    }

    @Override
    public void delete(T t) {
        System.out.println("deleted");
    }

    @Override
    public void update(T t) {
        System.out.println("updated");
    }
}
