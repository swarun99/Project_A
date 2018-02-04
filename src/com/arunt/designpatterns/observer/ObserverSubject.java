package com.arunt.designpatterns.observer;


public interface ObserverSubject {

    void registerObserver(ObserverConsumer observer);

    void removeObserver(ObserverConsumer observer);

    void notifyObservers();
}
