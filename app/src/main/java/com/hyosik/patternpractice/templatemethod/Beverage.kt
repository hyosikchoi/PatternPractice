package com.hyosik.patternpractice.templatemethod

internal abstract class Beverage {

    // Template method
    // prepareRecipe 가 하나의 템플릿이 되는 메서드다.
    fun prepareRecipe() {
        boilWater()
        brew()
        pourInCup()
        addCondiments()
    }

    fun boilWater() {
        println("Boiling water")
    }

    fun pourInCup() {
        println("Pouring into cup")
    }

    abstract fun brew()
    abstract fun addCondiments()
}