package org.example.section5OperatorsAndBooleans

fun main() {
    // Question 1
    val expression1 = 5.374 * 9.5847
    val expression2 = 3.237 * 15.3726
    println("Is expression1 greater than expression 2 ? ${expression1 > expression2}")

    // Question 2
    println("Is expression ((true && false) || (true || false)) ? ${((true && false) || (true || false))}")

    // Question 3
    println("Is the expression !((3 >= 3) && (false || (2 < 5))) true or false ? ${!((3 >= 3) && (false || (2 < 5)))}")

    // Question 4
    val toys = 2
    val brokenToys = 1
    val notBrokenToys = toys - brokenToys
    val canGetNewToys = (toys < 5) && (notBrokenToys >= 1)
    if (canGetNewToys) {
        println("Parents will buy a new toy")
    } else {
        println("Parents will not buy a new toy")
    }

    // Question 5
    val totalCows = 3
    val producesMilk = 1
    val children = 2
    val canGetFunding = ((totalCows <= 5) && (producesMilk > 0)) || (children + 1 >= 3)

    if (canGetFunding) {
        println("Farmer will get funding")
    } else {
        println("Farmer will not get funding")
    }
}