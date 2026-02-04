package org.example.section11IfConditional

fun main() {
    print("Enter your age: ")
    val age = readln().toInt() ?: 0

    if (age >= 18) {
        println("Adult")
    } else {
        println("Not Adult")
    }

    var clientFunds = 100
    val price = 50
    var clientProducts = 0

    if (clientFunds > price) {
        clientFunds -= price
        clientProducts += 1
        println("You have purchased $clientProducts products")
    } else {
        println("You have insufficient funds to purchase the products")
    }

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = true

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy only cat")
        }
    } else {
        println("Ask the pet store owner to get a cat")
    }

    if (age >= 18) {
        println("Adult")
    } else if (age >= 12) {
        println("Teenager")
    } else {
        println("Child")
    }
}