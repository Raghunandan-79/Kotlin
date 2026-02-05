package org.example.section17FunctionsContinued

fun listAnimals() {
    fun listOneAnimal(animal: String) {
        println("I have a $animal")
    }

    val myAnimals = arrayListOf("cat", "dog", "cow", "horse")

    for (animal in myAnimals) {
        listOneAnimal(animal)
    }
}

fun main() {
    listAnimals()
}