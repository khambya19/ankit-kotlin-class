package com.ankit.kotlin

/**
 * Demonstrates Kotlin's null safety features
 */
fun main() {
    println("Null Safety in Kotlin")
    println("====================\n")
    
    demonstrateNullableTypes()
    demonstrateSafeCallOperator()
    demonstrateElvisOperator()
    demonstrateLetFunction()
}

/**
 * Demonstrates nullable and non-nullable types
 */
fun demonstrateNullableTypes() {
    println("1. Nullable Types:")
    
    // Non-nullable type
    val name: String = "Ankit"
    println("   Name: $name")
    
    // Nullable type
    val nullableName: String? = null
    println("   Nullable name: $nullableName")
    
    // Safe length access
    println("   Name length: ${name.length}")
    println("   Nullable name length: ${nullableName?.length}")
}

/**
 * Demonstrates safe call operator (?.)
 */
fun demonstrateSafeCallOperator() {
    println("\n2. Safe Call Operator (?.):")
    
    val text: String? = "Kotlin"
    val nullText: String? = null
    
    println("   Text uppercase: ${text?.uppercase()}")
    println("   Null text uppercase: ${nullText?.uppercase()}")
    
    // Chaining safe calls
    val user: User? = User("Alice", Address("123 Main St"))
    println("   User's street: ${user?.address?.street}")
    
    val nullUser: User? = null
    println("   Null user's street: ${nullUser?.address?.street}")
}

/**
 * Demonstrates Elvis operator (?:)
 */
fun demonstrateElvisOperator() {
    println("\n3. Elvis Operator (?:):")
    
    val name: String? = null
    val displayName = name ?: "Unknown"
    println("   Display name: $displayName")
    
    val length: Int = name?.length ?: 0
    println("   Length: $length")
}

/**
 * Demonstrates let function for null safety
 */
fun demonstrateLetFunction() {
    println("\n4. Let Function:")
    
    val email: String? = "ankit@example.com"
    
    email?.let {
        println("   Email is not null: $it")
        println("   Email length: ${it.length}")
    }
    
    val nullEmail: String? = null
    nullEmail?.let {
        println("   This won't be printed")
    } ?: println("   Email is null")
}

/**
 * User data class for demonstration
 */
data class User(
    val name: String,
    val address: Address?
)

/**
 * Address data class for demonstration
 */
data class Address(
    val street: String
)
