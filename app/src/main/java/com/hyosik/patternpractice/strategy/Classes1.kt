package com.hyosik.patternpractice.strategy


internal class CreditCardPayment(private val name: String, private val cardNumber: String) :
    PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid with credit card")
    }
}


internal class PayPalPayment(private val email: String) : PaymentStrategy {
    override fun pay(amount: Int) {
        println("$amount paid using PayPal")
    }
}


// Context class
internal class ShoppingCart {
    private var paymentStrategy: PaymentStrategy? = null
    fun setPaymentStrategy(paymentStrategy: PaymentStrategy?) {
        this.paymentStrategy = paymentStrategy
    }

    fun checkout(amount: Int) {
        paymentStrategy!!.pay(amount)
    }
}