package org.example.section14WhileLoop

fun main() {
    var i = 0
    var j = 0

    while (i <= 5) {
        while (j <= 5) {
            print("$i, $j\t")
            j++
        }
        i++
        j = 0
        println()
    }
}