package org.example.section12Expressions

fun main() {
    val num1 = 2
    val num2 = 3

    if (num1 + num2 == 5) {
        println("Correct")
    } else {
        println("Not correct")
    }

    val haveCat = true
    val haveCatFood = true
    if (haveCat && haveCatFood) {
        println("Cat is happy")
    } else {
        print("Oh no!")
    }
}