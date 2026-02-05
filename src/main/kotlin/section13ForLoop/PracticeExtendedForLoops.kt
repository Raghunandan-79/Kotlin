package org.example.section13ForLoop

fun main() {
    // Question 1
    print("Enter a value: ")
    val maxValue = readln().toIntOrNull()

    if (maxValue != null) {
        for (i in maxValue downTo 1) {
            if (i % 7 == 0) {
                println("$i is divisible by 7")
            }
        }
    } else {
        println("Dude, please enter a number")
    }

    // Question 2
    print("Please enter a number: ")
    val num = readln().toIntOrNull()

    if (num != null) {
        for (i in 1..num) {
            for (j in 1 until i) {
                print("\uD83D\uDE00 ")
            }
            println()
        }
    } else {
        println("Dude, please enter a number")
    }
}