package org.example.section9Set

fun main() {
    val numbers = setOf(1, 64, 1, 6, 64)
    println(numbers)

    val numbers2 = setOf<Int>()
    println(numbers2)

    val numbers3 = setOf(1, null, 3, null, 4, 3)
    println(numbers3)
}