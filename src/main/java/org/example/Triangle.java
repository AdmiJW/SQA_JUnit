package org.example;

public class Triangle {

    public boolean is_Valid(double side1, double side2, double side3) {
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            return true;
        }
        return false;
    }

    public double area_triangle(double side1, double side2, double side3) {
        if (!is_Valid(side1, side2, side3)) throw new IllegalArgumentException("Invalid triangle");

        double area = 0;
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

}
