package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnits {
    @Test
    public void testGetCustomerId() {
        Customer customer = new Customer(123, "New Customer");
        assertEquals("123", customer.getId());
    }
    @Test
    public void testGetCustomerName() {
        Customer customer = new Customer(123, "New Customer");
        assertEquals("New Customer", customer.getName());
    }
    @Test
    public void testGetCustomer1() {
        CustomerData_HTTPS newSystem = new ConcreteHTTPS();
        CustomerData_USB adapter = new Adapter(newSystem);
        adapter.printCustomer(1);
    }
    @Test
    public void testGetCustomer2() {
        CustomerData_HTTPS newSystem = new ConcreteHTTPS();
        CustomerData_USB adapter = new Adapter(newSystem);
        adapter.printCustomer(2);
    }
    @Test
    public void testGetCustomer3() {
        CustomerData_HTTPS newSystem = new ConcreteHTTPS();
        CustomerData_USB adapter = new Adapter(newSystem);
        adapter.printCustomer(3);
    }
    @Test
    public void testGetCustomer404() {
        CustomerData_HTTPS newSystem = new ConcreteHTTPS();
        CustomerData_USB adapter = new Adapter(newSystem);
        adapter.printCustomer(404);
    }

}
