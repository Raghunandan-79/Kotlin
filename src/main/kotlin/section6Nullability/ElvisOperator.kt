package org.example.section6Nullability

fun main() {
    var catName: String? = "Fluffy"
    println("Name of cat is ${catName?: "This cat has no name"}")
    catName = null
    println("Name of cat is ${catName?: "no name"}")
}