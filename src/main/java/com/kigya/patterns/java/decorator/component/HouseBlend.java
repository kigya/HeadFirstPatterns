package com.kigya.patterns.java.decorator.component;

import com.kigya.patterns.java.decorator.component.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}

