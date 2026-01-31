package org.example.section3UserInput

fun main() {
    println("Enter a number")
    val userInput = readln().toIntOrNull()

    if (userInput != null) {
        println("You wrote: ${userInput * 2}")
    } else {
        println("Dude enter a valid number")
    }
}