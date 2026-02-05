package org.example.section17FunctionsContinued

fun multiply(number: Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

fun sayHello(person: String) {
    println("Namaste $person")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hello $person")
    }
}

fun main() {
    println(multiply(3))
    println(multiply(3, 5))

    sayHello("Raghu")
    sayHello(listOf("Raghu", "Daksh", "Pankaj", "Jaskaran", "Rohinish"))
}