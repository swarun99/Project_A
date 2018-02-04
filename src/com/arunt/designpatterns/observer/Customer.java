package com.arunt.designpatterns.observer;

public class Customer implements ObserverConsumer {

    private String customerName;
    private String subject;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void update(String productName) {
        System.out.println("Hello " + customerName + "," + productName + " is now available");
    }

    public static class ObserverPatternTest {

        public static void main(String[] args) {

            Customer customer1 = new Customer();
            customer1.setCustomerName("Arun");
            Customer customer2 = new Customer();
            customer2.setCustomerName("Sreya");

            Product iphone7 = new Product();
            iphone7.setProductName(("Apple IPhone 7"));
            iphone7.setAvailable(false);

            iphone7.registerObserver(customer1);
            iphone7.registerObserver(customer2);

            iphone7.setAvailable(true);


        }
    }
}
