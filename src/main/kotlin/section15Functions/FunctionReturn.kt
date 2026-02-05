package org.example.section15Functions

fun calculateCircleArea(radius: Int): Double {
    val pi = 3.1415
    return pi * radius * radius
}

fun personalizedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you ok $person"
        'W' -> "What's up $person"
        else -> "Hi $person"
    }

    return greeting
}

fun calculateCircleArea2(radius: Int) = 3.1415 * radius * radius

fun main() {
    val radius = 4
    println("A circle with $radius has area ${calculateCircleArea(radius)}")

    val person = "Raghu"
    println(personalizedGreeting(person))

    println(calculateCircleArea2(radius))
}