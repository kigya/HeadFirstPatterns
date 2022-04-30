package com.kigya.patterns.java.observer.subscribers;

import com.kigya.patterns.java.observer.publisher.WeatherData;
import lombok.extern.flogger.Flogger;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Level;

@Flogger
public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0f;

    public HeatIndexDisplay(@NotNull WeatherData weatherData) {
        weatherData.registerObserver(this);
    }

    public void update(float t, float rh, float pressure) {
        heatIndex = computeHeatIndex(t, rh);
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    public void display() {
        log.at(Level.INFO).log("Heat index is " + heatIndex);
    }
}
