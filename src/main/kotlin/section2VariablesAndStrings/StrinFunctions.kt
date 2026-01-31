package org.example.section2VariablesAndStrings

fun main(args: Array<String>) {
    val myPet = "crocodile"

    // prints length
    println(myPet.length)

    val myName = "raghunandan"
    // capitalizes first character
    println(myName.replaceFirstChar { it.uppercase() })

    val myAnimal = "Giraffe"
    // decapitalize first character
    println(myAnimal.replaceFirstChar { it.lowercase() })

    val text = "   there are too many spaces    "
    // trims the leading and trailing white spaces
    println(text.trim())

    // below two statements will get a character at the index give here the index is 3
    println(myPet.get(3))
    println(myPet[3])

    // prints a substring from 3 to last index of string
    println(myPet.substring(3))

    // prints a substring from index 3 to 6
    println(myPet.substring(3, 6))

    // makes all characters uppercase
    println(myPet.uppercase())
}
