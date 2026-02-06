package org.example.section18Lambdas

fun sayHello(names: ArrayList<String>, doSomething:  (String) -> Unit) {
    for (name in names) {
        doSomething(name)
    }
}

fun main() {
    val myLambda2 = {name: String -> println("Hello $name")}

    val names = arrayListOf("Mary", "Kate", "Mike")
    sayHello(names, myLambda2)
    sayHello(names, {
            name: String -> println("Hello there $name")
        }
    )
}