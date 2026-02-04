package org.example.section12Expressions

fun main() {
    val animals = arrayListOf<String>()

    if (animals.isEmpty()) {
        animals.add("dog")
    }

    println(animals)

    if (animals.add("Horse")) {
        println("Horse was added successfully")
    }
}