package org.example.section17FunctionsContinued

fun feedAnimal(animal: String) {
    println("Feed the $animal")
}

fun feedAnimal(animals: Collection<String>) {
    for (animal in animals) {
        println("Feed the $animal")
    }
}

fun printSize(message: String) {
    println("$message has a size of ${message.length}")
}

fun printSize(size: Int) {
    var message = ""
    for (i in 1..size) {
        message += 'A'
    }
    println("\"$message\" has a size of ${message.length}")
}

fun main() {
    // Question 1
    feedAnimal("Dog")
    feedAnimal(listOf("Dog", "Cat", "Lion"))

    // Question 2
    printSize("Hey how are you")
    printSize(8)
}