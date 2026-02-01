package org.example.section5OperatorsAndBooleans

fun main() {
    val a: Short = 6
    val b = 32
    val result = a * b
    println(result::class.java) // the result here will be int as int has larger size in memory
}