package org.example.section4NumbersAndVariableTypes

fun main() {
    val items = 5
    println(items::class.java)

    val numberOfPeople = 750000000000
    println(numberOfPeople::class.java)

    val price = 29.99
    println(price::class.java)

    val pi = 3.1415926535
    println(pi::class.java)
}