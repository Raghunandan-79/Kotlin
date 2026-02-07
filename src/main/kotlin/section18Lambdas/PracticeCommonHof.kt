package org.example.section18Lambdas

fun main() {
    // Question 1
    val numbers = setOf(1, 69, 55, 67, 124, 99)
    val doubleDigit = numbers.filter { it in 10 until 100 }
    println(doubleDigit)

    // Question 2
    val clients = listOf("Alice", "Bob", "Carol", "David")
    println(clients.sortedBy { it[it.length - 1] })

    // Question 3
    val numbers3Digit = listOf(124, 126, 168, 699)
    println(numbers3Digit.maxBy { it / 10 })

    // Question 4
    val numbers1 = listOf(69, 54, 67, 124, 121, 420)
    val subset = numbers1.map {
        if (it % 2 == 0) {
            it / 2
        } else {
            it * 2
        }
    }.filter { it > 25 }
    println(subset)
}