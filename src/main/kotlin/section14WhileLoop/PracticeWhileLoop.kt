package org.example.section14WhileLoop

fun main() {
    // Question 1
    var i = 1
    while (i <= 10) {
        println("#$i Hello, Have a good day")
        i++
    }

    // Question 2
    val cats = listOf("Tiger", "Smokey", "Sassy", "Patch", "Sammy")
    var cat = 0
    while (cat < cats.size) {
        println("Hello ${cats[cat]}")
        cat++
    }

    // Question 3
    print("Please enter a number: ")
    val num = readln().toIntOrNull()
    if (num != null) {
        var fact = 1
        var i = 1

        while (i <= num) {
            fact *= i
            i++
        }

        println("Factorial of $num is $fact")
    } else {
        println("Dude, please enter a number")
    }

    // Question 4
    print("Enter a large integer: ")
    val num1 = readln().toIntOrNull()

    if (num1 != null) {
        var curr = 7

        while (curr < num1) {
            if (curr % 7 == 0) {
                println("$curr is divisible by 7")
            }

            curr++
        }
    } else {
        println("Dude, please enter a number")
    }
}