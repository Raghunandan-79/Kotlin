package org.example.section6Nullability

fun main() {
    // using the Nullable '?' operator
    var catName: String? = "Chonkers"
    println(catName?.length)
    catName = null
    println("Name of cat is $catName")

    println(catName?.length)
}