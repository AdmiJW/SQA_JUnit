package org.example;

import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

    Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Triangle();
    }

    //==============================
    // Test cases for is_Valid()
    //==============================
    @Test
    public void equilateralTriangleIsValid() {
        double side = 10;
        assertTrue(triangle.is_Valid(side, side, side));
    }

    @Test
    public void isoscelesTriangleIsValid() {
        double x = 10, y = 15, z = 15;
        assertTrue(triangle.is_Valid(x, y, z));
    }

    @Test
    public void scaleneTriangleIsValid() {
        double x = 10, y = 15, z = 20;
        assertTrue(triangle.is_Valid(x, y, z));
    }

    @Test
    public void triangleWithZeroLengthSideIsInvalid() {
        double x = 0, y = 15, z = 20;
        assertFalse(triangle.is_Valid(x, y, z));
    }

    @Test
    public void triangleWithNegativeLengthSideIsInvalid() {
        double x = -10, y = 15, z = 20;
        assertFalse(triangle.is_Valid(x, y, z));
    }

    @Test
    public void triangleWithOneSideLongerThanOtherTwoSidesCombinedIsInvalid() {
        double x = 10, y = 15, z = 100;
        assertFalse(triangle.is_Valid(x, y, z));
    }



    //================================
    // Test cases for area_triangle()
    //================================
    @Test
    public void areaOfEquilateralTriangle() {
        double side = 10;
        double expected = 43.30127018922193;
        assertEquals(expected, triangle.area_triangle(side, side, side), 0.00000000000001);
    }

    @Test
    public void areaOfIsoscelesTriangle() {
        double x = 10, y = 15, z = 15;
        double expected = 70.71067811865476;
        assertEquals(expected, triangle.area_triangle(x, y, z), 0.00000000000001);
    }

    @Test
    public void areaOfScaleneTriangle() {
        double x = 10, y = 15, z = 20;
        double expected = 72.61843774138907;
        assertEquals(expected, triangle.area_triangle(x, y, z), 0.00000000000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areaOfTriangleWithZeroLengthSide() {
        double x = 0, y = 15, z = 20;
        double expected = 0;
        triangle.area_triangle(x, y, z);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areaOfTriangleWithNegativeLengthSide() {
        double x = -10, y = 15, z = 20;
        double expected = 0;
        triangle.area_triangle(x, y, z);
    }

    @Test(expected = IllegalArgumentException.class)
    public void areaOfTriangleWithOneSideLongerThanOtherTwoSidesCombined() {
        double x = 10, y = 15, z = 100;
        double expected = 0;
        triangle.area_triangle(x, y, z);
    }
}
