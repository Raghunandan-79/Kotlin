package org.example.section9Set

fun main() {
    // Question 1
    val numbers = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
    println("Is 21 a prime number ? ${numbers.contains(21)}")
    println("Is 31 a prime number ? ${numbers.contains(13)}")

    // Question 2
    val myDrinks = hashSetOf("water", "coke", "pineapple juice", "ganne ka juice")
    val friendsDrinks = hashSetOf("water", "orange juice", "pineapple juice")
    println("Drinks that we both can enjoy: ${myDrinks.intersect(friendsDrinks)}")

    // Question 3
    var acceptedColors = hashSetOf("white", "black", "grey")
    val myColors = hashSetOf("blue", "red", "black", "green")
    acceptedColors.retainAll(myColors)
    println("What color clothes can you wear are: $acceptedColors")
    acceptedColors = hashSetOf("white", "black", "grey")
    acceptedColors.add("red")
    acceptedColors.retainAll(myColors)
    println("Now I can wear $acceptedColors")
}