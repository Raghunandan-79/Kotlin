package org.example.section4NumbersAndVariableTypes

fun main() {
    val num = 5
    println(num)
    println(num::class.java)

    val longNum = 5646489273297423689
    println(longNum)
    println(longNum::class.java)

    val doubleNum = 5.987934789
    println(doubleNum)
    println(doubleNum::class.java)

    print("Enter a number: ")
    val intNum = readln().toInt()
    val multiply = intNum * doubleNum
    println(multiply)
    println(multiply::class.java)
}