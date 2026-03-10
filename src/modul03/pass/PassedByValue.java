package modul03.pass;

public class PassedByValue {
    public static void main(String[] args) {
        int x, y;
        TestPass z;

        z = new TestPass(50, 100);
        x = 10;
        y = 20;

        System.out.println("=== PASS BY VALUE ===");
        System.out.println("Nilai sebelum passed by value:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Passed by value
        z.calculate(x, y);

        System.out.println("\nNilai sesudah passed by value:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        System.out.println("\n=== PASS BY REFERENCE ===");
        System.out.println("Nilai sebelum passed by reference:");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);

        // Passed by reference
        z.calculate(z);

        System.out.println("\nNilai sesudah passed by reference:");
        System.out.println("z.i = " + z.i);
        System.out.println("z.j = " + z.j);
    }
}
