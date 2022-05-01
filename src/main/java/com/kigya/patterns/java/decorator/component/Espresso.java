package com.kigya.patterns.java.decorator.component;

import com.kigya.patterns.java.decorator.component.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

