package org.example.section4NumbersAndVariableTypes

fun main() {
    // implicit
    val cats = 3
    println(cats::class.java)

    val price = 14.99
    println(price::class.java)

    // explicit
    val dogs: Byte = 5
    println(dogs::class.java)

    val days: Short = 20000
    println(days::class.java)

    val life: Long = 42
    println(life::class.java)

    val newLife = 42L
    println(newLife::class.java)

    val money = 5.99
    println(money::class.java)

    val moreMoney = 6.99F
    println(moreMoney::class.java)
}