package org.example.section8List

fun main() {
    // Question 1
    val winners = listOf("Usain", "John", "Michael", "Alex", "Bob")
    println("The position at which Michael finished race is: ${winners.indexOf("Michael") + 1}")

    // Question 2
    val colorsNeeded = listOf("red", "green", "blue")
    val colorsAvailable = listOf("red", "blue")
    println("Can the printer print ? ${colorsAvailable.containsAll(colorsNeeded)}")

    // Question 3
    val ingredients = arrayListOf("Paneer", "Egg", "Mozzarella", "Pepper")
    val indexOfMozzarella = ingredients.indexOf("Mozzarella")
    ingredients[indexOfMozzarella] = "Blue Cheese"
    println("Ingredients are: $ingredients")

    // Question 4
    val animals = arrayListOf("Lion", "Zebra", "Chimp", "Elephant")
    animals.add("Panda")
    println(animals)
    animals.remove("Lion")
    println(animals)
    println("Does the zoo have both elephants and giraffes ? ${animals.containsAll(listOf("Elephant, Giraffe"))}")
}