package org.example.section11IfConditional

fun main() {
    // Question 1
    print("Enter an integer: ")
    val num = readln().toIntOrNull()

    if (num != null) {
        val msg = if ((num in 0 .. 9)) "Number is single digit" else "Number has more than single digit"
        println(msg)
    } else {
        println("Dude, enter a number")
    }

    // Question 2
    val response = 404
    val message = if (response / 100 == 1) {
        "Information response"
    } else if (response / 100 == 2) {
        "Success"
    } else if (response / 100 == 3) {
        "Redirect"
    } else if (response / 100 == 4) {
        "Client error"
    } else {
        "Server error"
    }

    println(message)
}