package org.example.section6Nullability

fun main() {
    print("Enter a number: ")
    val input = readln()
    val number = input.toIntOrNull()
    println("$number multiplied by 5 is ${number!! * 5}")

    val cost = 29.99
    print("How may products you want to buy: ")
    val productsToBuy = readln().toIntOrNull()
    if (productsToBuy == null) {
        val totalCost = 1 * cost
        println("You have entered wrong input. Hence cost is $totalCost")
    } else {
        val totalCost = productsToBuy * cost
        println("Total cost is $totalCost")
    }
}