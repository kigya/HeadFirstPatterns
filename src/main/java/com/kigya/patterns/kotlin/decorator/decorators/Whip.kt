package com.kigya.patterns.kotlin.decorator.decorators

import com.kigya.patterns.kotlin.decorator.component.Beverage

class Whip(private val beverage: Beverage) : CondimentDecorator() {

    override val description: String
        get() = "${beverage.description}, Whip"

    override fun cost(): Double = beverage.cost() + .10
}