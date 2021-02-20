package com.training.dependency.injection;

import com.training.dependency.injection.dao.CustomerDao;
import com.training.dependency.injection.entity.Customer;
import com.training.dependency.injection.manager.concrete.CustomerManager;

public class Runner {
    public static void main(String[] args) {
        Customer customer=new Customer("Semih","Türkmenoğlu","Türkiye");
        CustomerManager customerManager =new CustomerManager(new CustomerDao());
        customerManager.getAll();
        customerManager.add(customer);
        customerManager.update(customer);
        customerManager.delete(customer);
    }
}
