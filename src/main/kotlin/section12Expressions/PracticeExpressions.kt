package org.example.section12Expressions

fun main() {
    // Question 1
    val guestList = setOf("John", "Alice", "Bob", "Carol")
    print("Please enter your name: ")
    val guest = readlnOrNull()

    if (guest in guestList) {
        println("Hi $guest please come in")
    } else {
        println("Sorry, you're not on the guest list")
    }

    // Question 2
    print("How many cats do you have ? : ")
    val noOfCats = readln().toIntOrNull()
    val howMany = if (noOfCats in 1 .. 3) {
        "Few cats"
    } else if (noOfCats in 4 .. 6) {
        "Several cats"
    } else {
        "Many cats"
    }

    println("This person has $howMany")

    // Question 3
    val animals = arrayListOf<String>()
    if (animals.isEmpty()) {
        println("Thank you for giving home to all our pets")
    } else {
        println("Please come in and adopt a pet. We have $animals")
    }

    // Question 4
    print("Enter your age: ")
    var age = readln().toIntOrNull()
    if (age != null) {
        if (age == 0) age = 1

        if (age < 13)
            println("child")
        else if (age < 18)
            println("teen")
        else
            println("adult")
    } else {
        println("Dude age must be a number")
    }
}