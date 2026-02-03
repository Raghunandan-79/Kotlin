package org.example.section9Set

fun main() {
    val numbers = hashSetOf(3, 4, null, 83, 56)
    println(numbers)

    val newNumbers = setOf(83, 345, 56)
    println(numbers.intersect(newNumbers))

    numbers.clear()
    println(numbers)
}