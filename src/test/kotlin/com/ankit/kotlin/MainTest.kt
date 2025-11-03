package com.ankit.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Test class for Main.kt functions
 */
class MainTest {
    
    @Test
    fun `test greet function returns correct greeting`() {
        val result = greet("Alice")
        assertEquals("Hello, Alice! Welcome to Kotlin.", result)
    }
    
    @Test
    fun `test add function adds two numbers correctly`() {
        val result = add(5, 3)
        assertEquals(8, result)
    }
    
    @Test
    fun `test add function with negative numbers`() {
        val result = add(-5, 3)
        assertEquals(-2, result)
    }
    
    @Test
    fun `test createMessage function formats message correctly`() {
        val result = createMessage(name = "John", course = "Programming")
        assertEquals("John is learning Programming", result)
    }
    
    @Test
    fun `test Student class introduction`() {
        val student = Student("Alice", 25, "Computer Science")
        // Just verify it doesn't throw an exception
        student.introduce()
        assertTrue(true)
    }
    
    @Test
    fun `test Course data class creation`() {
        val course = Course("Kotlin Programming", "CS101", 40)
        assertEquals("Kotlin Programming", course.name)
        assertEquals("CS101", course.code)
        assertEquals(40, course.credits)
    }
    
    @Test
    fun `test Course data class copy method`() {
        val course1 = Course("Kotlin Programming", "CS101", 40)
        val course2 = course1.copy(credits = 50)
        
        assertEquals("Kotlin Programming", course2.name)
        assertEquals("CS101", course2.code)
        assertEquals(50, course2.credits)
    }
}
