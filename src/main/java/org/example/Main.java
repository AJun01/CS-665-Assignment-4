package org.example;
/**
 * Name: Yujun Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: Main.java
 * Description: this is main class, by rewiring the old system's API(CustomerData_USB)
 * to new System's interface(CustomerData_HTTPS), we use adapter to search for customer id=123
 */
public class Main {
    public static void main(String[] args) {
        //rewiring using adapter
        CustomerData_HTTPS newSystem = new ConcreteHTTPS();
        CustomerData_USB adapter = new Adapter(newSystem);

        //first customer will have 404 not found, the second one will retrieve successfully
        adapter.printCustomer(123);
        adapter.printCustomer(1);
    }
}