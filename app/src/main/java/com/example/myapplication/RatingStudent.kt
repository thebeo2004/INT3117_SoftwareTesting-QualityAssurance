package com.example.myapplication

/**
 * Rates a student based on their credit, GPA, and conduct score.
 *
 * @param x The number of credit. Must be between 0 and 30 inclusive.
 * @param y The GPA (Grade Point Average). Must be between 0.0 and 4.0 inclusive.
 * @param z The conduct score. Must be between 0 and 100 inclusive.
 * @return A string representing the student's rating:
 * - "S" for scholarship eligibility (credits >= 15, GPA >= 3.85, conduct >= 90)
 * - "A" for excellent (GPA >= 3.6, conduct >= 90)
 * - "B" for very good (GPA >= 3.2, conduct >= 80)
 * - "C" for good (GPA >= 3.0, conduct >= 70)
 * - "D" for average (GPA >= 2.5, conduct >= 60)
 * - "F" for poor (GPA < 2.5 or conduct < 60)
 * - "-" for no credits (credits = 0)
 * - "Invalid" if any input is out of the specified range
 */
fun Rate(x: Int, y: Double, z: Int): String {
    // Check if the number of credit hours is within the valid range
    if (x < 0 || x > 30) {
        return "Invalid"
    }
    // Check if the GPA is within the valid range
    if (y < 0.0 || y > 4.0) {
        return "Invalid"
    }
    // Check if the conduct score is within the valid range
    if (z < 0 || z > 100) {
        return "Invalid"
    }
    // Return "-" if the number of credit hours is zero
    if (x == 0) {
        return "-"
    }
    // Determine the rating based on the given criteria
    if (x >= 15 && y >= 3.85 && z >= 90) {
        return "S"
    }
    if (y >= 3.6 && z >= 90) {
        return "A"
    }
    if (y >= 3.2 && z >= 80) {
        return "B"
    }
    if (y >= 3.0 && z >= 70) {
        return "C"
    }
    if (y >= 2.5 && z >= 60) {
        return "D"
    }
    return "F"
}