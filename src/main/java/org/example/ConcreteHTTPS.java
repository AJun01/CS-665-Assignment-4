package org.example;

import java.util.HashMap;
import java.util.Map;
/**
 * Name: Yujun Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: ConcreteHTTPS.java
 * Description: this is ConcreteHTTPS class, concrete class of interface CustomerData_HTTPS,has a data bank of customers
 */
public class ConcreteHTTPS implements CustomerData_HTTPS{
    private static Map<Integer, Customer> customerDataStore = new HashMap<>();
    private Customer customer;

    @Override
    public void printCustomer(int customerId) {
        getCustomer_HTTPS(customerId);
        System.out.println("Customer from HTTPS: " + this.customer.toString());
    }
    @Override
    public void getCustomer_HTTPS(int customerId) {
        customerDataStore.put(1, new Customer(1, "Jane Smith"));
        customerDataStore.put(2, new Customer(2, "John Smith"));
        customerDataStore.put(3, new Customer(3, "Joe Smith"));
        customerDataStore.put(4, new Customer(4, "Jill Smith"));
        customerDataStore.put(5, new Customer(5, "Julie Smith"));

        if (customerDataStore.containsKey(customerId)){
            this.customer = customerDataStore.get(customerId);
        }else{
            this.customer = new Customer(404, "NOT FOUND");
        }
    }
}
