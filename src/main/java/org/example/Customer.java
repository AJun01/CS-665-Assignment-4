package org.example;
/**
 * Name: Yujun Liu
 * Course: CS-665 Software Designs & Patterns
 * Date: 03/19/2024
 * File Name: Customer.java
 * Description: this is Customer class, contains id and name as string, the getters for them, with toString method
 */
public class Customer {
    private final int id;
    private final String name;
    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.id + " " + this.name;
    }
    public String getId(){return Integer.toString(id);}
    public String getName(){return name;}
}
