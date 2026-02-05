package org.example.section14WhileLoop

fun main() {
    val puzzlePieces = 20
    var piecesPlaced = 0

    do {
        piecesPlaced++
        println("Placed piece #$piecesPlaced")
    } while (piecesPlaced < puzzlePieces)
}