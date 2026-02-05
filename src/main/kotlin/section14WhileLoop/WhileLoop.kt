package org.example.section14WhileLoop

fun main() {
    val puzzlePieces = 20
    var piecesPlaced = 0

    while (piecesPlaced < puzzlePieces) {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")
    }
}