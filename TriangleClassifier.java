package triangleTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleClassifier {
    
    public static String classifyTriangle(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Invalid input";
        }
        
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        
        if (sides[0] + sides[1] <= sides[2]) {
            return "Not a triangle";
        }
        
        String triangleType = "";
        if (a == b && b == c) {
            triangleType = "Equilateral";
        } else if (a == b || b == c || a == c) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }
        
        if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
            triangleType += " Right";
        }
        
        return triangleType;
    }
}

