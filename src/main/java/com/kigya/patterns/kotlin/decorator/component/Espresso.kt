package com.kigya.patterns.kotlin.decorator.component

class Espresso : Beverage() {

    override val description: String = javaClass.simpleName

    override fun cost(): Double = 1.99
}