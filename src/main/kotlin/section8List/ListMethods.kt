package org.example.section8List

fun main() {
    val colors = listOf("blue", "red", "blue", "green")

    println(colors.size) // 4

    println(colors.contains("red")) // true

    val newColors = listOf("red", "green")
    println(colors.containsAll(newColors)) // true

    println(colors.indexOf("blue")) // 0

    println(colors.lastIndexOf("blue")) // 2
}