package org.example.section12WhenConditional

fun main() {
    print("Enter the animal: ")
    val animal = readlnOrNull()?.lowercase()

    val action = when (animal) {
        "cat" -> {
            "pet it"
        }
        "dog" -> {
            "feed it"
        }
        else -> {
            "google it"
        }
    }

    println(action)

    print("Enter a number: ")
    val num = readln().toIntOrNull()

    if (num != null) {
        val result =  when (num % 2) {
            0 -> "$num is even"
            1 -> "$num is odd"
            else -> ""
        }

        println(result)
    } else {
        println("Dude, please enter a number")
    }
}