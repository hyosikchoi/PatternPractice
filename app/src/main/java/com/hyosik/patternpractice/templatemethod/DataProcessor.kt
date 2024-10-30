package com.hyosik.patternpractice.templatemethod


internal abstract class DataProcessor {
    // Template Method
    // 템플릿 메소드 안에 if 문을 포함하여 추상메서드들을 정의
    fun process(data: String?) {
        loadData(data)
        if (isValidData(data)) {
            processData(data)
            saveData(data)
        } else {
            println("Data is invalid, processing aborted.")
        }
    }

    protected abstract fun loadData(data: String?)
    protected abstract fun isValidData(data: String?): Boolean
    protected abstract fun processData(data: String?)
    protected abstract fun saveData(data: String?)
}