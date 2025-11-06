package com.example.ankit

fun main() {
    val dictionary = mutableMapOf(
        "car" to "it is a vehicle ",
        "cat" to " domestic animal",
        "computer" to "A electronic device "
    )

    print("Enter a word: ")
    val word = readLine()

    println(dictionary[word] ?: "Word not found")
}
