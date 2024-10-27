package com.hyosik.patternpractice.strategy

// Client code
fun main() {
    // 전략 패턴은 어떠한 기능을 수행 할 때 여러가지의 방법으로 그 기능을 수행하도록 만들 수 있는 패턴이다!
    // 결제 기능을 할 때 현금으로도 할 수 있고, 카드 혹은 삼성페이등 여러가지 방법으로 결제를 할 수 있는게 그 예다!
    // Solid 에서 말하는 개방/폐쇄의 원칙을 준수하고 있는 패턴이다! (뭐가 바뀔 때면 해당 전략만 수정하면 되고, 필요하면 새로운 전략을 만들면 되므로)
    // 예제1
    val cart = ShoppingCart()
    cart.setPaymentStrategy(
        CreditCardPayment(
            "John Doe",
            "1234567890123456"
        )
    )
    cart.checkout(100)
    //100 paid with credit card

    cart.setPaymentStrategy(
        PayPalPayment(
            "johndoe@example.com"
        )
    )
    cart.checkout(200)
    // 200 paid using PayPal


    // 예제2
    // 각각의 전략은 자신들만의 알고리즘을 담고 있다!
    val compressor = Compressor()
    val data = "aabcccccaaa"

    compressor.setCompressionStrategy(RunLengthEncoding())
    println(
        "RLE Compression: " + compressor.compress(data)
    )
    // RLE Compression: a2b1c5a3

    compressor.setCompressionStrategy(SimpleReplacementCompression())
    println(
        "Simple Replacement: " + compressor.compress(data)
    )
    // Simple Replacement: 11bccccc111

}