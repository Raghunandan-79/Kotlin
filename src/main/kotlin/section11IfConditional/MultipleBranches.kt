package org.example.section11IfConditional

fun main() {
    print("Enter your marks (1-100): ")
    val marks = readln().toIntOrNull()

    if (marks != null) {
        if (marks > 100) {
            println("Marks should be below 100")
        } else if (marks in 80..100) {
            println("Grade A")
        } else if (marks >= 60) {
            println("Grade B")
        } else if (marks >= 40) {
            println("Grade C")
        } else if (marks >= 0) {
            println("Fail")
        } else {
            println("Marks should be greater than 0")
        }
    } else {
        println("Marks must be a number")
    }
}