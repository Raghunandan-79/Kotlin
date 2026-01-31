package org.example.section2VariablesAndStrings

fun main() {
    val catName = "My cat's name is \"Fluffy\""
    println("Length is catName variable is: ${catName.length}")

    val myCar = "My car won't start"
    println(myCar.substring(3, 6))

    val clientName = "John"
    println("Good morning $clientName. Have a nice day!")

    val apples = 3
    val oranges = 6
    println("Total fruits available are ${apples + oranges}")

    // Exercise
    val client = "Mary"
    val products = 3
    val price = 30
    println("$client needs to pay a total amount of ${products * price}")
}