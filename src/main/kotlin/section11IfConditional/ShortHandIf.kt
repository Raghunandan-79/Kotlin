package org.example.section11IfConditional

fun main() {
    print("Enter a number: ")
    val number = readln().toIntOrNull()

    if (number != null) {
        if (number % 2 == 0)
            println("Number is even")
        else
            println("Number is odd")
    }

    if (number != null) {
        if (number % 2 == 0) println("$number is even") else println("$number is odd")
    }

    if (number != null) {
        val isEven = if (number % 2 == 0) "Number is even" else "Number is odd"
        println(isEven)
    }
}