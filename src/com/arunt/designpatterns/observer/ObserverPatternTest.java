package com.arunt.designpatterns.observer;

public class ObserverPatternTest {

    public static void main(String[] args) {

        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setCustomerName("Arunt");
        customer2.setCustomerName("Sreyat");

        Product iphone7 = new Product();

        iphone7.setProductName("IPHONE 7");

        iphone7.registerObserver(customer1);
        iphone7.registerObserver(customer2);

        iphone7.setAvailable(true);

    }
}
