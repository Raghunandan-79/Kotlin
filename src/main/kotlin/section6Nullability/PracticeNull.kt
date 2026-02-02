package org.example.section6Nullability

fun main() {
    // Question 1
    val firstName: String? = "Raghunandan"
    println("Substring from position 3 to 6 is: ${firstName?.substring(3, 7)}")

    // Question 2
    val doubleNum: Double? = 5.9999
    val doubleNumFloat = doubleNum?.toFloat()?.times(6)
    println("After multiplying $doubleNum with 6 and converting to float the value of doubleNum is: $doubleNumFloat")

    // Question 3
    print("Enter a number: ")
    val num = readln().toIntOrNull()
    val doubleNum1 = num?.toDouble()
    if (doubleNum1 != null) {
        val result = doubleNum1 * 7
        println(result)
    } else {
        println("Dude, enter a valid number")
    }
}