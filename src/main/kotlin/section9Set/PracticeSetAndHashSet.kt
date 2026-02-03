package org.example.section9Set

fun main() {
    // Question 1
    val colors = hashSetOf<String>()
    val colorsToAdd = setOf("Red", "Blue", "Black")
    colors.addAll(colorsToAdd)
    println(colors)
    colors.remove("Blue")
    println(colors)

    // Question 2
    val objectsOnTable = hashSetOf("Laptop", "Speakers", "Router", "Mouse", "Keyboard")
    val objectsToRemove = setOf("Router", "Speakers")
    println(objectsOnTable)
    objectsOnTable.removeAll(objectsToRemove)
    println(objectsOnTable)

    // Question 3
    val customers = hashSetOf("Raghu", "Daksh", "Pankaj", "Jaskaran", "Rohinish")
    println(customers)
    val addCustomer = "Snake"
    customers.add(addCustomer)
    println(customers)
    val leavingCustomer = "Snake"
    customers.remove(leavingCustomer)
    println(customers)
}