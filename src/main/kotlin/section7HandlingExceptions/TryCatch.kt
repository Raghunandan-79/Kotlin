package org.example.section7HandlingExceptions

fun main() {
    var test: String? = readln()
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        println("Exception occurred\n ${e.localizedMessage}")
    }

    test = readln()
    try {
        println(test.toInt())
    } catch (e: Exception) {
        println("An exception occurred\n ${e.printStackTrace()}")
    }
}