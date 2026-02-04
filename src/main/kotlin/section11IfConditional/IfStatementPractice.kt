package org.example.section11IfConditional

fun main() {
    // Question 1
    print("Do you have the keys with you? (true or false): ")
    var keys = readln().lowercase().toBoolean()

    if (keys) {
        println("Starting the car")
    } else {
        println("You cannot start the car without keys")
    }

    print("Do you have keys with you? (yes or no): ")
    val input = readln().lowercase()
    keys = input == "yes"

    if (keys) {
        println("Starting the car")
    } else {
        println("You cannot start the car without keys")
    }

    // Question 2
    print("Enter current time (0-23): ")
    val timeInput = readln().toIntOrNull()
    if (timeInput != null) {
        if (timeInput < 12) {
            println("It's $timeInput am")
        } else {
            if (timeInput == 12) {
                println("It's $timeInput pm")
            } else {
                println("It's ${timeInput - 12} pm")
            }
        }
    } else {
        println("Dude, enter hour in numbers.")
    }

    // Question 3
    val hasEggs = true
    val hasBacon = false
    val eggsCost = 5
    val baconPackCost = 20
    var boughtEggs = 0
    var boughtBacon = 0

    if (hasEggs) {
        boughtEggs += 12
        if (hasBacon) {
            boughtBacon += 2
        } else {
            println("No bacon packs available")
        }
    } else {
        println("There are no eggs available")
    }

    val totalSpend = (boughtEggs * eggsCost) + (boughtBacon * baconPackCost)
    println("The total amount man spend at the market is $totalSpend")
}