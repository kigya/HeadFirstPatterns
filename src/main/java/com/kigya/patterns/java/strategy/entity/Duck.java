package com.kigya.patterns.java.strategy.entity;

import com.kigya.patterns.java.strategy.behaviour.FlyBehaviour;
import com.kigya.patterns.java.strategy.behaviour.QuackBehaviour;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.flogger.Flogger;

import java.util.logging.Level;

@Setter
@Flogger
@NoArgsConstructor(access = AccessLevel.PACKAGE)
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        log.at(Level.INFO).log("All ducks float, even decoys!", Duck.class.toString());
    }
}
