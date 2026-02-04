package org.example.section12Expressions

fun main() {
    val favouritePets = "dog"
    val availablePets = listOf("dog", "cat", "horse")

    if (favouritePets in availablePets) {
        println("We have your next best friend")
    } else {
        println("Sorry, $favouritePets is not available")
    }

    print("Enter your preferred coffee: ")
    val coffee = readln()
    val availableCoffee = listOf("Cappuccino", "Mocha")
    if (coffee !in availableCoffee) println("Sorry we don't have your coffee")
    else println("$coffee is available")
}