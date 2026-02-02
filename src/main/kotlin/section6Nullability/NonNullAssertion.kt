package org.example.section6Nullability

fun main() {
    val catName: String? = null
    println(catName!!.length) // it will give an error
}