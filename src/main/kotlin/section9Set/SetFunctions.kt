package org.example.section9Set

fun main() {
    val numbers = hashSetOf(1, 4, 69, 67, 124)
    println(numbers)

    println(numbers.size)

    println(numbers.contains(69))

    println(numbers.containsAll(listOf(1, 4, 67)))

    println(numbers.isEmpty())

    println(hashSetOf<Int>().isEmpty())
}