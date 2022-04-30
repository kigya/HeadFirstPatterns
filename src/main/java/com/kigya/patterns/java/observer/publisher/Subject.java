package com.kigya.patterns.java.observer.publisher;

import com.kigya.patterns.java.observer.subscribers.Observer;

public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
