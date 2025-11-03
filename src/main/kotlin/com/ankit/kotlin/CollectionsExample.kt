package com.ankit.kotlin

/**
 * Demonstrates Kotlin collections and their operations
 */
fun main() {
    println("Collections in Kotlin")
    println("====================\n")
    
    demonstrateLists()
    demonstrateSets()
    demonstrateMaps()
    demonstrateCollectionOperations()
}

/**
 * Demonstrates List operations
 */
fun demonstrateLists() {
    println("1. Lists:")
    
    // Immutable list
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("   Fruits: $fruits")
    println("   First fruit: ${fruits.first()}")
    println("   Last fruit: ${fruits.last()}")
    
    // Mutable list
    val numbers = mutableListOf(1, 2, 3)
    numbers.add(4)
    numbers.add(5)
    println("   Numbers: $numbers")
}

/**
 * Demonstrates Set operations
 */
fun demonstrateSets() {
    println("\n2. Sets:")
    
    // Immutable set
    val uniqueNumbers = setOf(1, 2, 3, 2, 1)
    println("   Unique numbers: $uniqueNumbers")
    
    // Mutable set
    val colors = mutableSetOf("Red", "Green")
    colors.add("Blue")
    colors.add("Red") // Won't be added (duplicate)
    println("   Colors: $colors")
}

/**
 * Demonstrates Map operations
 */
fun demonstrateMaps() {
    println("\n3. Maps:")
    
    // Immutable map
    val scores = mapOf(
        "Alice" to 95,
        "Bob" to 87,
        "Charlie" to 92
    )
    println("   Scores: $scores")
    println("   Alice's score: ${scores["Alice"]}")
    
    // Mutable map
    val phoneBook = mutableMapOf(
        "John" to "123-456-7890",
        "Jane" to "098-765-4321"
    )
    phoneBook["Jack"] = "555-555-5555"
    println("   Phone book: $phoneBook")
}

/**
 * Demonstrates collection operations like filter, map, reduce
 */
fun demonstrateCollectionOperations() {
    println("\n4. Collection Operations:")
    
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    
    // Filter
    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("   Even numbers: $evenNumbers")
    
    // Map
    val squares = numbers.map { it * it }
    println("   Squares: $squares")
    
    // Reduce
    val sum = numbers.reduce { acc, num -> acc + num }
    println("   Sum: $sum")
    
    // Find
    val firstGreaterThanFive = numbers.find { it > 5 }
    println("   First number greater than 5: $firstGreaterThanFive")
    
    // Any, All, None
    println("   Has even numbers: ${numbers.any { it % 2 == 0 }}")
    println("   All positive: ${numbers.all { it > 0 }}")
    println("   None negative: ${numbers.none { it < 0 }}")
}
