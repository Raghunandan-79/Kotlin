package org.example.section15Functions

fun sayHello1() {
    println("Hello")
}

fun multiplyNumber() {
    print("Enter a number: ")
    var num = readln().toIntOrNull()
    if (num != null) {
        num *= 17
        println("After multiplying entered number by 17 result is $num")
    } else {
        println("Dude, please enter a number")
    }
}

fun main() {
    // Question 1
    for (i in 1..10) {
        print("#$i ")
        sayHello1()
    }

    // Question 2
    for (i in 1..3) {
        multiplyNumber()
    }
}