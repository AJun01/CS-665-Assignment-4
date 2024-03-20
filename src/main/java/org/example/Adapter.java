package org.example;
/**
 * Name: Yujun Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: Adapter.java
 * Description: this is adapter class, extended from CustomerData_USB, takes the newSystem and returns its data
 */
public class Adapter implements CustomerData_USB{
    private CustomerData_HTTPS newSystem;

    public Adapter(CustomerData_HTTPS newSystem) {
        this.newSystem = newSystem;
    }
    @Override
    public void printCustomer(int customerId) {
        newSystem.getCustomer_HTTPS(customerId);
        newSystem.printCustomer(customerId);
    }
    @Override
    public void getCustomer_USB(int customerId) {
        newSystem.getCustomer_HTTPS(customerId);
    }
}
