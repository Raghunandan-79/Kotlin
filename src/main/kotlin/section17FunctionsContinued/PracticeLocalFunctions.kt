package org.example.section17FunctionsContinued

fun awesomeBank(users: HashMap<String, Double?>) {
    fun doubleAmount(amount: Double?) = amount?.times(2)

    for (user in users.keys) {
        users[user] = doubleAmount(users[user])
    }

    println(users)
}

fun printGreeting() {
    fun sayHi(name: String) {
        println("Hi $name how are you?")
    }

    while (true) {
        print("Please enter a name: ")
        val name = readln()
        if (name == "") break

        sayHi(name)
    }
}

fun main() {
    // Question 1
    awesomeBank(hashMapOf(Pair("Alice", 546.0), Pair("Bob", 345.0), Pair("Carol", 456.0)))

    // Question 2
    printGreeting()
}