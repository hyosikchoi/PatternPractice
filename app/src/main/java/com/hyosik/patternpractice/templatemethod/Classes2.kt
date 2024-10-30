package com.hyosik.patternpractice.templatemethod


internal class CSVDataProcessor : DataProcessor() {
    override fun loadData(data: String?) {
        println("Loading data from CSV file: $data")
    }

    override fun isValidData(data: String?): Boolean {
        return data != null && data.contains("CSV")
    }

    override fun processData(data: String?) {
        println("Processing CSV data")
    }

    override fun saveData(data: String?) {
        println("Saving CSV data to database")
    }
}


internal class JSONDataProcessor : DataProcessor() {
    override fun loadData(data: String?) {
        println("Loading data from JSON file: $data")
    }

    override fun isValidData(data: String?): Boolean {
        return data != null
    }

    override fun processData(data: String?) {
        println("Processing JSON data")
    }

    override fun saveData(data: String?) {
        println("Saving JSON data to database")
    }
}