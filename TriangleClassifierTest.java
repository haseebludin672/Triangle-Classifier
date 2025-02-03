package triangleTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    
    @Test
    void testEquilateral() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(3, 3, 3));
    }
    
    @Test
    void testIsosceles() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 3));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 3, 5));
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(3, 5, 5));
    }
    
    @Test
    void testScalene() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(4, 5, 6));
    }
    
    @Test
    void testRightTriangle() {
        assertEquals("Scalene Right", TriangleClassifier.classifyTriangle(3, 4, 5));
        assertEquals("Scalene Right", TriangleClassifier.classifyTriangle(5, 12, 13));
    }
    
    @Test
    void testNotATriangle() {
        assertEquals("Not a triangle", TriangleClassifier.classifyTriangle(1, 2, 3));
        assertEquals("Not a triangle", TriangleClassifier.classifyTriangle(10, 2, 3));
    }
    
    @Test
    void testInvalidInput() {
        assertEquals("Invalid input", TriangleClassifier.classifyTriangle(0, 5, 5));
        assertEquals("Invalid input", TriangleClassifier.classifyTriangle(-1, 5, 5));
        assertEquals("Invalid input", TriangleClassifier.classifyTriangle(3, -4, 5));
    }
}
