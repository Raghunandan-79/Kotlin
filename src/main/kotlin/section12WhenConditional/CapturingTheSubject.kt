package org.example.section12WhenConditional

fun main() {
    print("Enter your name: ")
    val name = readln()

    when (val length = name.length) {
        in 1 .. 5 -> println("A name with $length characters is small")
        in 6 .. 10 -> println("A name with $length characters is medium")
        else -> println("A name with $length characters is long")
    }
}