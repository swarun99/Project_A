package com.arunt.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;


public class Product implements ObserverSubject {


    private String productName;
    private List<ObserverConsumer> listOfObservers = new ArrayList<ObserverConsumer>();
    private boolean available;

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
        if (available == true) {
            notifyObservers();
        }
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<ObserverConsumer> getListOfObservers() {
        return listOfObservers;
    }

    public void setListOfObservers(List<ObserverConsumer> listOfObservers) {
        this.listOfObservers = listOfObservers;
    }


    @Override
    public void registerObserver(ObserverConsumer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(ObserverConsumer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverConsumer observer : listOfObservers) {

            observer.update(productName);
        }

    }


}

