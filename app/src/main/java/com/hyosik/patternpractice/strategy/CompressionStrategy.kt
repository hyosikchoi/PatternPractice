package com.hyosik.patternpractice.strategy

interface CompressionStrategy {
    fun compress(data: String): String
}