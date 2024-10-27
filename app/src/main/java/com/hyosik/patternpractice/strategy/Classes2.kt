package com.hyosik.patternpractice.strategy


internal class RunLengthEncoding : CompressionStrategy {
    override fun compress(data: String): String {
        val compressed = StringBuilder()
        var count = 1
        for (i in 1..data.length) {
            if (i < data.length && data[i] == data[i - 1]) {
                count++
            } else {
                compressed.append(data[i - 1])
                compressed.append(count)
                count = 1
            }
        }
        return compressed.toString()
    }
}


internal class SimpleReplacementCompression : CompressionStrategy {
    override fun compress(data: String): String {
        return data.replace("a", "1")
            .replace("e", "2")
            .replace("i", "3")
            .replace("o", "4")
            .replace("u", "5")
    }
}

// Context class
internal class Compressor {
    private var strategy: CompressionStrategy? = null
    fun setCompressionStrategy(strategy: CompressionStrategy?) {
        this.strategy = strategy
    }

    fun compress(data: String?): String {
        return strategy!!.compress(data!!)
    }
}