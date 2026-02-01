package org.example.section5OperatorsAndBooleans

fun main() {
    var isDay = true
    var isEvening = true

    println(isDay && isEvening)

    isDay = false
    println(isDay || isEvening)

    isEvening = false
    println(!isEvening)
}