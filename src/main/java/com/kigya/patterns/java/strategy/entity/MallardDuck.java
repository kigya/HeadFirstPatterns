package com.kigya.patterns.java.strategy.entity;

import com.kigya.patterns.java.strategy.implementation.FlyWithWings;
import com.kigya.patterns.java.strategy.implementation.Squeak;
import lombok.ToString;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Flogger
@ToString
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Squeak();
        flyBehaviour = new FlyWithWings();
        display();
        performQuack();
        performFly();
    }

    public void display() {
        log.at(Level.INFO).log("I'm a real Mallard duck");
    }
}
