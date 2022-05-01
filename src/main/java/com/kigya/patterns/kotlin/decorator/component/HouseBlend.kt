package com.kigya.patterns.kotlin.decorator.component

class HouseBlend : Beverage() {

    override val description: String = javaClass.simpleName

    override fun cost(): Double = .89
}