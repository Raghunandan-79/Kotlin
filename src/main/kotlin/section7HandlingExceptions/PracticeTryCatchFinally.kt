package org.example.section7HandlingExceptions

import kotlin.system.exitProcess

fun main() {
    // Question 1
    print("Enter a number: ")
    val number: String? = readln()
    try {
        val num = number?.toInt()
        println("$num * 5 = ${num?.times(5)}")
    } catch (e: Exception) {
        println("You have not entered a number")
    }

    // Question 2
    print("Enter how many kilometers you ran today ? ")
    val runKilometers: String? = readln()
    try {
        val kilometers = runKilometers?.toInt()
        val runKilometersInMiles = kilometers?.times(0.621371)
        println("$kilometers in miles are $runKilometersInMiles")
    } catch (e: Exception) {
        println("Kilometers must be a number")
    }

    // Question 3
    print("Enter what you want to buy: ")
    val buy: String = readln()
    print("How many products you require ? ")
    val require: String? = readln()

    try {
        val requireProducts = require?.toInt()
        val priceOfOneProduct = 9.99
        println("Total cost you have to pay is ${requireProducts?.times(priceOfOneProduct)}")
    } catch (e: Exception) {
        println("Product amount must be a number")
    } finally {
        println("Exiting the program")
        exitProcess(0)
    }
}