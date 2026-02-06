package org.example.section18Lambdas

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for (i in 0 until numbers.size) {
        if (numbers[i] % 2 == 0) {
            numbers[i] = lbd(numbers[i])
        }
    }

    return numbers
}

fun personalizedMessage(clients: ArrayList<String>, lbd1: (String) -> String): ArrayList<String> {
    for (i in 0 until clients.size) {
        clients[i] = lbd1(clients[i])
    }

    return clients
}

fun personalizedMessage2(clients: Collection<String>, getMessage: (String) -> String): ArrayList<String> {
    val messages = arrayListOf<String>()

    for (client in clients) {
        messages.add(getMessage(client))
    }

    return messages
}


fun main() {
    // Question 1
    val numbers = arrayListOf(3, 8, 6, 5, 435, 56, 34, 768, 45)
    println(numbers)
    val newNumbers = update(numbers) {
        number -> number / 10
    }
    println(newNumbers)

    // Question 2
    val clients = arrayListOf("John", "Jae", "Ellen", "Jake", "Sophie")
//    println(clients)
//    val newClients = personalizedMessage(clients) {
//        clients -> "Hello $clients"
//    }
//    println(newClients)

    println(clients)
    val messages = personalizedMessage2(clients) {name -> "Hello $name how are you"}
    for (i in 0 until messages.size) {
        println("Message for ${clients[i]}")
        println(messages[i])
    }
}