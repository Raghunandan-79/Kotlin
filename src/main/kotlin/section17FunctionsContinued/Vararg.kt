package org.example.section17FunctionsContinued

fun sayHello1(vararg names: String) {
    for (name in names) {
        println("Hello $name")
    }
}

fun main() {
    sayHello1("Raghu")
    sayHello1("Raghu", "Daksh", "Pankaj", "Jaskaran", "Rohinish")
}