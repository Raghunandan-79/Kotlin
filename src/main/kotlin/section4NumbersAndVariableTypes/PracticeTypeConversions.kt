package org.example.section4NumbersAndVariableTypes

fun main() {
    /*
    Question 1: Ask the user for a number, and read the input
    Convert that value to:
        * a byte
        * a short
        * an int
        * a long
        * a float
        * a double
    */
    print("Enter a number: ")
    val num = readln()

    val numByte = num.toByte()
    println(numByte)
    println(numByte::class.java)

    val numShort = num.toShort()
    println(numShort)
    println(numShort::class.java)

    val numInt = num.toInt()
    println(numInt)
    println(numInt::class.java)

    val numLong = num.toLong()
    println(numLong)
    println(numLong::class.java)

    val numFloat = num.toFloat()
    println(numFloat)
    println(numFloat::class.java)

    val numDouble = num.toDouble()
    println(numDouble)
    println(numDouble::class.java)

    /*
    Question 2: You have a variable "var pi = 4.14159"

    * What is the type?
    * Convert it to a float. What is the value? Print it
    * Convert it to an int. What is the value? Print it
    * Convert it to a string. What is the value? Print it
    */

    println()
    println("Question 2")

    val pi = 4.14159

    val piFloat = pi.toFloat()
    println(piFloat)

    val piInt = pi.toInt()
    println(piInt)

    val piString = pi.toString()
    println(piString)

    println()
    println("Question 3")
    print("Enter a decimal number: ")
    val doubleNum = readln().toDouble()
    val multiplyWithPi = doubleNum * pi
    println(multiplyWithPi)
}