package com.hyosik.patternpractice.strategy

interface PaymentStrategy {
    fun pay(amount: Int)
}