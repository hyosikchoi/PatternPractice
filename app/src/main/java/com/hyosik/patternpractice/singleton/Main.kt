package com.hyosik.patternpractice.singleton

fun main() {
    val themeOne = Theme.getInstance()
    val themeTwo = Theme.getInstance()

    println(themeOne.hashCode() == themeTwo.hashCode()) // true

}