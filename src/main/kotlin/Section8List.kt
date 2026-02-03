package org.example

fun main() {
    val colors = listOf("blue", "yellow", "red")
    println(colors)

    val colors2 = listOf<String>()
    println(colors2)

    val colors3 = listOf("blue", "red", "blue", "green", "blue")
    println(colors3)

    val colors4 = listOf("blue", "red", "blue", null, null)
    println(colors4)

    println(colors4[0])
    println(colors4[1])
    println(colors4.get(1))
    println(colors4.size)
}