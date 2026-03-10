package modul03.circle;

public class MainCircle {
    public static void main(String[] args) {
        // Membuat objek Circle pertama
        Circle lingkaran1 = new Circle();
        lingkaran1.r = 5.0;

        System.out.println("Lingkaran 1:");
        System.out.println("Jari-jari: " + lingkaran1.r);
        System.out.println("Luas: " + lingkaran1.area());
        System.out.println("Keliling: " + lingkaran1.circumference());

        // Membuat objek Circle kedua
        Circle lingkaran2 = new Circle();
        lingkaran2.r = 10.0;

        System.out.println("\nLingkaran 2:");
        System.out.println("Jari-jari: " + lingkaran2.r);
        System.out.println("Luas: " + lingkaran2.area());
        System.out.println("Keliling: " + lingkaran2.circumference());

        // Mengakses class field dan static method
        System.out.println("\nNilai PI: " + Circle.PI);
        System.out.println("1 radian = " + Circle.radiansToDegrees(1) + " derajat");
    }
}
