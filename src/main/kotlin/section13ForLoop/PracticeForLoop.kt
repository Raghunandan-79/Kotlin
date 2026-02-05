package org.example.section13ForLoop

fun main() {
    // Question 1
    for (i in 10 downTo 1) {
        println("#$i : Hello, have a good day")
    }

    // Question 2
    var sum = 0
    for (i in 1 .. 100) {
        sum += i
    }
    println("After adding all the numbers from 1 to 100 the result is $sum")

    // Question 3
    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    for (customer in customers) {
        println("${customer.key} have made ${customer.value} purchases")
    }
    println()

    for (customerName in customers.keys) {
        val purchases = customers[customerName]
        println("$customerName you purchased $purchases items")
    }
    println()

    // Question 4
    print("Enter a year: ")
    val year = readln().toInt()

    val isLeapYear = year % 4 == 0

    val months = listOf(
        "January", "February", "March", "April",
        "May", "June", "July", "August",
        "September", "October", "November", "December"
    )

    for (month in months) {
        val days = when (month) {
            "January", "March", "May", "July",
            "August", "October", "December" -> 31

            "April", "June", "September", "November" -> 30

            "February" -> if (isLeapYear) 29 else 28

            else -> 0
        }

        println("$month has $days days")
    }
}