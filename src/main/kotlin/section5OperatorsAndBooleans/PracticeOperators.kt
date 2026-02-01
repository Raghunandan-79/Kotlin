package org.example.section5OperatorsAndBooleans

fun main() {
    // Question 1
    val a = 76.254
    val b = 3.867

    val add = a + b
    println("Addition $add")

    val sub = a - b
    println("Subtraction $sub")

    val mult = a * b
    println("Multiplication $mult")

    val divide = a / b
    println("Division $divide")

    val remainder = a % b
    println("Remainder $remainder")

    // Question 2
    val cost = 29.99
    println("Cost of third of a kilo meat is ${cost / 3}")

    // Question 3
    print("Enter the amount you have in your bank account: ")
    var amountInAccount = readln().toIntOrNull()
    if (amountInAccount != null) {
        val amountAfterContestWin = 3 * amountInAccount
        println("After winning the contest amount in your bank account is $amountAfterContestWin")
    } else {
        println("Dude, amount must be a number")
    }

    // Question 4
    print("Enter the amount in your bank account: ")
    amountInAccount = readln().toIntOrNull()
    val interest = 5.5 / 100
    val years = 5
    if (amountInAccount != null) {
        val after5Years = amountInAccount * (1 + interest * years)
        println("Amount in your account after 5 years will be $after5Years")
    } else {
        println("Dude, amount must be a number")
    }
}