package org.example.section4NumbersAndVariableTypes

fun main() {
    val cats = 3
    val longCats = cats.toLong()

    println(cats::class.java)
    println(longCats::class.java)

    val people = 75000000000
    val fewPeople = people.toInt()
    println(fewPeople)

    val dogs = 5
    val byteDogs = dogs.toByte()
    println(byteDogs::class.java)
    val floatDogs = dogs.toFloat()
    println(floatDogs::class.java)
}