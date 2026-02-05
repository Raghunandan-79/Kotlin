package org.example.section17FunctionsContinued

fun sumOfIntegers(vararg numbers: Int): Int {
    var sum = 0
    val n = numbers.size
    for (num in numbers) {
        sum += num
    }

    return sum
}


fun main() {
    // Question 1
    println(sumOfIntegers(1, 2))
    println(sumOfIntegers(1, 2, 3, 4, 5))
}