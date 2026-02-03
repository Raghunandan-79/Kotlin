package org.example.section8List

fun main() {
    // Question 1
    val animals = listOf("Lion", "Dog", "Tiger", "Cheetah")
    println("Total animals in list animals are: ${animals.size}")

    println("Second element in animals list is: ${animals[1]}")

    // Question 2
    val customers = arrayListOf("Raghu", "Daksh", "Pankaj", "Jaskaran", "Rohinish")
    val newCustomer = "snake"
    customers.add(newCustomer)
    println("Customers are: $customers")
    customers.remove("snake")
    println("Customers are: $customers")

    // Question 3
    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removeItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removeItems)
    println("After removing $removeItems from desk, remaining items on desk are $items")
}