package com.hyosik.patternpractice.singleton

class Theme(
    var themeColor: String = "light"
) {
    companion object {
        var inst: Theme? = null
        fun getInstance(): Theme =
            inst?.let {
                return it
            } ?: kotlin.run {
                inst = Theme()
                inst!!
            }
    }
}