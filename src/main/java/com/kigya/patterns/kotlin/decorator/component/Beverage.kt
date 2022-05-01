package com.kigya.patterns.kotlin.decorator.component

abstract class Beverage {

    open val description: String = "Unknown beverage"

    abstract fun cost(): Double
}