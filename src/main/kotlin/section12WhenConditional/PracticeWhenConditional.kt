package org.example.section12WhenConditional

fun main() {
    // Question 1
    print("How many meals you have every day ? (Enter a number): ")
    val mealsPerDay = readln().toIntOrNull() ?: 3

    when (mealsPerDay) {
        in 0 .. 2 -> println("You should increase the number of meals")
        3 -> println("That's perfect")
        else -> println("Try eating healthy number of meals")
    }

    // Question 2
    print("Enter the current hour (0-23): ")
    var hour = readln().toIntOrNull()
    if (hour != null) {
        if (hour > 23) hour = 23

        val timeOfTheDay = when (hour) {
            in 6 .. 11 -> "morning"
            in 12 .. 14 -> "noon"
            in 15 .. 17 -> "afternoon"
            in 18 .. 21 -> "evening"
            else -> "night"
        }

        println("At $hour:00 it's $timeOfTheDay")
    } else {
        println("Dude, hour must be a number")
    }

    // Question 3
    print("Enter your name: ")
    val name = readln()

    when (name[0]) {
        in 'A' .. 'C' -> println("Hello $name, welcome")
        in 'D' .. 'F' ->  println("Hello $name, how are you?")
        else -> println("Hi")
    }
}