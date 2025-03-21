package com.example.myapplication

import org.junit.Assert.assertEquals
import org.junit.Test

class RatingStudentTest {
    @Test
    fun testRate() {
        // Blackbox Testing
        assertEquals("Invalid", Rate(-1, 3.8, 50))
        assertEquals("Invalid", Rate(31, 3.75, 45))
        assertEquals("Invalid", Rate(25, -1.0, 50))
        assertEquals("Invalid", Rate(25, 4.1, 50))
        assertEquals("Invalid", Rate(25, 3.75, -1))
        assertEquals("Invalid", Rate(25, 3.75, 101))
        assertEquals("-", Rate(0, 3.5, 50))

        assertEquals("F", Rate(14, 1.0, 50))
        assertEquals("F", Rate(14, 1.0, 65))
        assertEquals("F", Rate(14, 1.0, 75))
        assertEquals("F", Rate(14, 1.0, 85))
        assertEquals("F", Rate(14, 1.0, 95))

        assertEquals("F", Rate(14, 2.5, 50))
        assertEquals("D", Rate(14, 2.5, 65))
        assertEquals("D", Rate(14, 2.5, 75))
        assertEquals("D", Rate(14, 2.5, 85))
        assertEquals("D", Rate(14, 2.5, 95))

        assertEquals("F", Rate(14, 3.19, 50))
        assertEquals("D", Rate(14, 3.19, 65))
        assertEquals("C", Rate(14, 3.19, 75))
        assertEquals("C", Rate(14, 3.19, 85))
        assertEquals("C", Rate(14, 3.19, 95))

        assertEquals("F", Rate(14, 3.5, 50))
        assertEquals("D", Rate(14, 3.5, 65))
        assertEquals("C", Rate(14, 3.5, 75))
        assertEquals("B", Rate(14, 3.5, 85))
        assertEquals("B", Rate(14, 3.5, 95))

        assertEquals("F", Rate(14, 3.9, 50))
        assertEquals("D", Rate(14, 3.9, 65))
        assertEquals("C", Rate(14, 3.9, 75))
        assertEquals("B", Rate(14, 3.9, 85))
        assertEquals("A", Rate(14, 3.9, 95))

        // x = 25
        assertEquals("F", Rate(25, 1.0, 50))
        assertEquals("F", Rate(25, 1.0, 65))
        assertEquals("F", Rate(25, 1.0, 75))
        assertEquals("F", Rate(25, 1.0, 85))
        assertEquals("F", Rate(25, 1.0, 95))

        assertEquals("F", Rate(25, 2.5, 50))
        assertEquals("D", Rate(25, 2.5, 65))
        assertEquals("D", Rate(25, 2.5, 75))
        assertEquals("D", Rate(25, 2.5, 85))
        assertEquals("D", Rate(25, 2.5, 95))

        assertEquals("F", Rate(25, 3.19, 50))
        assertEquals("D", Rate(25, 3.19, 65))
        assertEquals("C", Rate(25, 3.19, 75))
        assertEquals("C", Rate(25, 3.19, 85))
        assertEquals("C", Rate(25, 3.19, 95))

        assertEquals("F", Rate(25, 3.5, 50))
        assertEquals("D", Rate(25, 3.5, 65))
        assertEquals("C", Rate(25, 3.5, 75))
        assertEquals("B", Rate(25, 3.5, 85))
        assertEquals("B", Rate(25, 3.5, 95))

        assertEquals("F", Rate(25, 3.9, 50))
        assertEquals("D", Rate(25, 3.9, 65))
        assertEquals("C", Rate(25, 3.9, 75))
        assertEquals("B", Rate(25, 3.9, 85))

        //Whitebox Testing with given C2 coverage
        assertEquals("Invalid", Rate(-1, 4.0, 100))
        assertEquals("Invalid", Rate(15, 4.1, 100))
        assertEquals("Invalid", Rate(15, 3.8, 101))
        assertEquals("-", Rate(0, 3.8, 90))
        assertEquals("S", Rate(15, 3.9, 90))
        assertEquals("A", Rate(14, 3.6, 90))
        assertEquals("B", Rate(14, 3.6, 80))
        assertEquals("C", Rate(14, 3.6, 70))
        assertEquals("D", Rate(14, 3.6, 60))
        assertEquals("F", Rate(14, 3.6, 50))

        //All-use coverage
        assertEquals("Invalid", Rate(-1, 30.0, 30))
        assertEquals("Invalid", Rate(17, -1.0, 50))
        assertEquals("-", Rate(0, 3.5, 95))
        assertEquals("S", Rate(15, 3.85, 90))
        assertEquals("S", Rate(15, 3.85, 90))
        assertEquals("A", Rate(15, 3.6, 90))
        assertEquals("-", Rate(0, 3.5, 95))
        assertEquals("Invalid", Rate(17, -1.0, 50))
        assertEquals("S", Rate(15, 3.85, 90))
        assertEquals("A", Rate(15, 3.6, 90))
        assertEquals("A", Rate(15, 3.6, 90))
        assertEquals("B", Rate(15, 3.2, 80))
        assertEquals("B", Rate(15, 3.2, 80))
        assertEquals("C", Rate(15, 3.0, 70))
        assertEquals("C", Rate(15, 3.0, 70))
        assertEquals("D", Rate(12, 2.5, 60))
        assertEquals("D", Rate(12, 2.5, 60))
        assertEquals("F", Rate(12, 3.85, 50))
        assertEquals("-", Rate(0, 3.5, 95))
        assertEquals("Invalid", Rate(15, 3.85, -1))
        assertEquals("S", Rate(15, 3.85, 90))
        assertEquals("A", Rate(15, 3.6, 90))
        assertEquals("A", Rate(15, 3.6, 90))
        assertEquals("B", Rate(15, 3.2, 80))
        assertEquals("B", Rate(15, 3.2, 80))
        assertEquals("C", Rate(15, 3.0, 70))
        assertEquals("C", Rate(15, 3.0, 70))
        assertEquals("D", Rate(12, 2.5, 60))
        assertEquals("D", Rate(12, 2.5, 60))
        assertEquals("F", Rate(12, 3.85, 50))

    }
}