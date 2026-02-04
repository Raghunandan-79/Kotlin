package org.example.section10Map
import kotlin.io.println

fun main() {
    // Question 1
    val count = hashMapOf(Pair(1, "un"), Pair(2, "deux"), Pair(3, "trois"))
    println("2 in french is: ${count[2]}")
    println("3 in french is: ${count[3]}")
    println(count)
    count[4] = "quatre"
    println(count)

    // Question 2
    val customers = mapOf(Pair("John", 1), Pair("Alice", 5), Pair("Bob", 3))
    println("Is Alice a customer ? : ${customers.containsKey("Alice")}")
    println("Alice bought ${customers["Alice"]} products")
    println("Is Michael a customer ? : ${customers.containsKey("Michael")}")

    // Question 3
    val attendance = hashMapOf(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    println(attendance)
    attendance["26 Sept"] = 6969
    println(attendance)
    val attendance25Sept = attendance["25 Sept"] ?: 0
    val attendance26Sept = attendance["26 Sept"] ?: 0
    println("Total number of people attended on 25 and 26 Sept are ${attendance25Sept + attendance26Sept}")

    println("Is the data for 22 Sept available ? : ${attendance.containsKey("22 Sept")}")
}