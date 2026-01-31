package org.example.section3UserInput

fun main() {
    print("Enter your name: ")
    val name = readln()
    println("Hello $name, have a good day.")

    print("Enter a number: ")
    val num = readln().toIntOrNull()
    if (num != null) {
        println("Your entered number multiplied by 5 is ${num * 5}.")
    } else {
        println("Dude enter a valid number.")
    }

    print("Enter your birth year: ")
    val birthYear = readln().toIntOrNull()
    val currentYear = 2026

    if (birthYear != null) {
        println("Your age is: ${currentYear - birthYear}")
    } else {
        println("You have entered wrong year. Year must be a number")
    }
}