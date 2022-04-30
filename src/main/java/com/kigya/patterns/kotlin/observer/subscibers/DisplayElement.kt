package com.kigya.patterns.kotlin.observer.subscibers

interface DisplayElement<T> {
    fun display(data: T)
}