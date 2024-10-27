package com.hyosik.patternpractice.facade

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

internal class FileReader {
    @Throws(IOException::class)
    fun readFile(filePath: String?): String {
        return String(Files.readAllBytes(Paths.get(filePath)))
    }
}


internal class FileWriter {
    @Throws(IOException::class)
    fun writeFile(filePath: String?, content: String) {
        Files.write(Paths.get(filePath), content.toByteArray())
    }
}

internal class FileDeleter {
    @Throws(IOException::class)
    fun deleteFile(filePath: String?) {
        Files.delete(Paths.get(filePath))
    }
}


internal class FileSystemFacade {
    private val fileReader: FileReader = FileReader()
    private val fileWriter: FileWriter = FileWriter()
    private val fileDeleter: FileDeleter = FileDeleter()

    fun readFile(filePath: String?): String? {
        return try {
            fileReader.readFile(filePath)
        } catch (e: IOException) {
            System.err.println("Error reading file: " + e.message)
            null
        }
    }

    fun writeFile(filePath: String?, content: String?): Boolean {
        return try {
            fileWriter.writeFile(filePath, content!!)
            true
        } catch (e: IOException) {
            System.err.println("Error writing file: " + e.message)
            false
        }
    }

    fun deleteFile(filePath: String?): Boolean {
        return try {
            fileDeleter.deleteFile(filePath)
            true
        } catch (e: IOException) {
            System.err.println("Error deleting file: " + e.message)
            false
        }
    }
}