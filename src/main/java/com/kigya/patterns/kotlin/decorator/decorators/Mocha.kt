package com.kigya.patterns.kotlin.decorator.decorators

import com.kigya.patterns.kotlin.decorator.component.Beverage

class Mocha(private val beverage: Beverage) : CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, Mocha"

    override fun cost(): Double = beverage.cost() + .20
}