package org.example.section6Nullability

fun main() {
    print("Enter a number: ")
    val a: Int? = readln().toInt()

    println(a?.plus(3))
    println(a?.minus(3))
    println(a?.times(2))
    println(a?.div(2))
    println(a?.rem(2))
}