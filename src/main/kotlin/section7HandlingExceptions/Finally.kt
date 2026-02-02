package org.example.section7HandlingExceptions

fun main() {
    var test: String? = readln()

    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("An exception has occurred")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }

    test = readln()
    try {
        println(test.toInt())
    } catch (e: Exception) {
        println("An exception has occurred")
        e.printStackTrace()
    } finally {
        println("The execution has completed")
    }
}