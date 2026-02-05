package org.example.section15Functions

fun double(number: Int) {
    println("Double $number is ${number * 2}")
}

fun sayHelloToPeople(people: Collection<String>) {
    for (person: String in people) {
        println("Hello $person")
    }
}

fun doubleMessage(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

fun main() {
    double(5)

    val people: List<String> = listOf("Anna", "Bob", "Carol")
    sayHelloToPeople(people)

    doubleMessage(5, "5 * 2 = ")
    doubleMessage(8)
}