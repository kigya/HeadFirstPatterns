package com.kigya.patterns.kotlin.observer.subscibers

interface Observer<T> {
    fun update(data: T)
}