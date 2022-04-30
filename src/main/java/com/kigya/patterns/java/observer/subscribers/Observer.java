package com.kigya.patterns.java.observer.subscribers;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
