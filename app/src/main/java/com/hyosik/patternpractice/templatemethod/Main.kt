package com.hyosik.patternpractice.templatemethod

fun main() {
    val tea: Beverage = Tea()
    val coffee: Beverage = Coffee()

    println("\nMaking tea...")
    tea.prepareRecipe()

    println("\nMaking coffee...")
    coffee.prepareRecipe()

    val csvProcessor: DataProcessor = CSVDataProcessor()
    csvProcessor.process("CSV data")

    println()

    val jsonProcessor: DataProcessor = JSONDataProcessor()
    jsonProcessor.process("XML data")

}