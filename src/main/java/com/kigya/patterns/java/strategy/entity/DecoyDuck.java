package com.kigya.patterns.java.strategy.entity;

import com.kigya.patterns.java.strategy.implementation.FlyNoWay;
import com.kigya.patterns.java.strategy.implementation.MuteQuack;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Flogger
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
        display();
        performQuack();
        performFly();
    }

    public void display() {
        log.at(Level.INFO).log("I'm a duck Decoy", DecoyDuck.class.toString());
    }
}
