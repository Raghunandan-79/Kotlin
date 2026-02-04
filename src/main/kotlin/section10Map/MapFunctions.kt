package org.example.section10Map

fun main() {
    val count = hashMapOf<Int, String>()
    val addToCount = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    count.putAll(addToCount)

    println("Size of map is: ${count.size}")
    println("Does the map have the key 2? : ${count.containsKey(2)}")
    println("Does the map have the key 5? : ${count.containsKey(5)}")
    println("Does the map contains value \"one\"? : ${count.containsValue("three")}")
    println("Does the map contains value \"six\"? : ${count.containsValue("six")}")
    println("Is the map empty ? : ${count.isEmpty()}")
    println("Is the new map empty ? : ${hashMapOf<Int, String>().isEmpty()}")
    println("Does the map have any key value pairs ? : ${count.isNotEmpty()}")

}