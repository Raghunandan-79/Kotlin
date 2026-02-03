package org.example.section9Set

fun main() {
    val numbers = hashSetOf(1, 2, 3, null, 2)
    println(numbers)

    val noNumbers = hashSetOf<Int>()
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    val newNumbers = hashSetOf(15, 16, 56)
    numbers.addAll(newNumbers)
    println(numbers)

    numbers.remove(56)
    println(numbers)

    val toRemove = hashSetOf(3, 15, null)
    numbers.removeAll(toRemove)
    println(numbers)

    numbers.clear()
    println(numbers)
}