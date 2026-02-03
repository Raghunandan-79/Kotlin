package org.example.section8List

fun main() {
    val colors = arrayListOf("blue", "red", "blue", "green")
    println(colors)

    colors[1] = "redder"
    println(colors)

    println(colors.subList(1, 3))

    println(colors.isEmpty())

    colors.reverse()

    println(colors)

    colors.clear()

    println(colors)
}