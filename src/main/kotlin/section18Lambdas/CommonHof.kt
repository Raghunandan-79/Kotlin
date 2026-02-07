package org.example.section18Lambdas

fun main() {
    val clients = listOf("Alice", "Bob", "Carol", "David")
    clients.forEach { println("Hello $it")}
    println()
    clients.filter { it.length < 5 }.forEach {
        println("Hello $it")
    }
    println()
    val sorted = clients.sortedBy { it.length }
    println(sorted)
    println()
    val max = clients.maxBy { it.length }
    println(max)
    println()

    val min = clients.minBy { it.length }
    println(min)
    println()

    val numbers = listOf(2, 4, 5, 7, 8, 10)
    val even = numbers.map { it % 2 == 0 }
    println(even)
}