package org.example.section8List

fun main() {
    val noColors = arrayListOf<String>()
    println(noColors)

    val colors = arrayListOf("blue", "red")
    println(colors)

    colors.add("yellow")
    println(colors)

    val moreColors = arrayListOf("pink", "teal")
    colors.addAll(moreColors)
    println(colors)

    colors.remove("red")
    println(colors)

    colors.removeAll(moreColors)
    println(colors)

    colors.removeAt(1)
    println(colors)

    println(colors.size)

    colors.add("red")
    colors.add("blue")
    println(colors)
    colors.remove("blue")
    println(colors)
}