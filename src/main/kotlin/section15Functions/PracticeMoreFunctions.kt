package org.example.section15Functions

fun sum(num1: Int, num2: Int) = num1 + num2

fun taxCalculator(products: HashMap<String, Double>): HashMap<String, Double> {
    for (it in products) {
        var price = it.value
        price *= 1.2
        products[it.key] = price
    }

    return products
}

fun main() {
    // Question 1
    val num1 = 7
    val num2 = 5
    println(sum(num1, num2))

    // Question 2
    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))
    println("After adding 20% tax to each item the price now is: ")
    println(taxCalculator(products))
}