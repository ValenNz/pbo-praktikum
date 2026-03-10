package modul03.circle;

public class Circle {
    // Class Field (static)
    public static final double PI = 3.14159;

    // Instance Field
    public double r;  // jari-jari

    // Method untuk menghitung luas
    public double area() {
        return PI * r * r;
    }

    // Method untuk menghitung keliling
    public double circumference() {
        return 2 * PI * r;
    }

    // Static method
    public static double radiansToDegrees(double rads) {
        return rads * 180 / PI;
    }
}
