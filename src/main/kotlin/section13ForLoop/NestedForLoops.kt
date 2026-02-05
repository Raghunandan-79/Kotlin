package org.example.section13ForLoop

fun main() {
    for (i in 1  .. 5) {
        for (j in 1 .. 5) {
            if (i == 1 || j == 1 || i == 5 || j == 5) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

    val matrixSize = 4
    for (i in 1..matrixSize) {
        for (j in 1..matrixSize) {
            if (i == j) print("diagonal\t")
            else print("$i,$j  \t\t")
        }
        println()
    }
}