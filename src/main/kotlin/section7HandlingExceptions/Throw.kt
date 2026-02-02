package org.example.section7HandlingExceptions

fun main() {
    var test: String? = readln()
    throw IllegalStateException("I don't like this input")
}