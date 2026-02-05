package org.example.section13ForLoop

fun main() {
    val animals = setOf("Dog", "Cat", "Horse")
    for (animal: String in animals) {
        println("Feed the $animal")
    }
    println()

    val colors = listOf("Red", "Blue", "Green", "Blue")
    for (color in colors) {
        println("Color is $color")
    }
    println()

    val juicePrices = mapOf(Pair("Apple", 100), Pair("Pineapple", 120), Pair("Mango", 140))
    for (juice in juicePrices) {
        println("Price of ${juice.key} juice is ${juice.value}")
    }
    println()

    for (i in 1 .. 12) {
        val month = when(i) {
            1 -> "January"
            2 -> "February"
            3 -> "March"
            4 -> "April"
            5 -> "May"
            6 -> "June"
            7 -> "July"
            8 -> "August"
            9 -> "September"
            10 -> "October"
            11 -> "November"
            12 -> "December"
            else -> ""
        }

        println("Month #$i is called $month")
    }
}