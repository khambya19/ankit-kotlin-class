package com.ankit.kotlin

/**
 * Main entry point for the Kotlin class examples
 */
fun main() {
    println("Welcome to Ankit's Kotlin Class!")
    println("================================")
    
    // Example 1: Variables and Data Types
    demonstrateVariables()
    
    // Example 2: Functions
    demonstrateFunctions()
    
    // Example 3: Classes
    demonstrateClasses()
}

/**
 * Demonstrates variable declarations and data types in Kotlin
 */
fun demonstrateVariables() {
    println("\n1. Variables and Data Types:")
    
    // Immutable variable (val)
    val name: String = "Ankit"
    println("   Name: $name")
    
    // Mutable variable (var)
    var age: Int = 25
    println("   Age: $age")
    age = 26
    println("   Updated Age: $age")
    
    // Type inference
    val course = "Kotlin Programming"
    println("   Course: $course")
    
    // Other data types
    val pi: Double = 3.14159
    val isStudent: Boolean = true
    println("   Pi: $pi, Is Student: $isStudent")
}

/**
 * Demonstrates function declarations and usage in Kotlin
 */
fun demonstrateFunctions() {
    println("\n2. Functions:")
    
    // Simple function call
    val greeting = greet("Ankit")
    println("   $greeting")
    
    // Function with default parameters
    val sum = add(5, 3)
    println("   Sum of 5 and 3: $sum")
    
    // Function with named parameters
    val message = createMessage(name = "Student", course = "Kotlin")
    println("   $message")
}

/**
 * Demonstrates class creation and usage in Kotlin
 */
fun demonstrateClasses() {
    println("\n3. Classes and Objects:")
    
    // Create an instance of Student class
    val student = Student("Ankit", 25, "Computer Science")
    student.introduce()
    
    // Create an instance with data class
    val course = Course("Kotlin Programming", "CS101", 40)
    println("   $course")
}

// Helper functions

/**
 * Returns a greeting message
 */
fun greet(name: String): String {
    return "Hello, $name! Welcome to Kotlin."
}

/**
 * Adds two numbers
 */
fun add(a: Int, b: Int): Int = a + b

/**
 * Creates a formatted message
 */
fun createMessage(name: String, course: String): String {
    return "$name is learning $course"
}

/**
 * Student class demonstrating Kotlin class features
 */
class Student(
    private val name: String,
    private val age: Int,
    private val major: String
) {
    fun introduce() {
        println("   Student: $name, Age: $age, Major: $major")
    }
}

/**
 * Course data class demonstrating data classes in Kotlin
 */
data class Course(
    val name: String,
    val code: String,
    val credits: Int
)
