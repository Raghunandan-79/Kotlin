package org.example.section14WhileLoop

fun main() {
    // Question 1
    var num: Int?
    do {
        print("Enter a number: ")
        num = readln().toIntOrNull()
        if (num != null) {
            println("You have entered $num")
        }
    } while (num != null && num <= 100)

    // Question 2
    val usernames = hashSetOf("john", "bob", "alice")
    print("Enter a username: ")
    var username = readln()
    do {
        println("Username already taken")
        print("Enter a new username: ")
        username = readln()
    } while (usernames.contains(username))

    println("Your username is $username")
}