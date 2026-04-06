package modul06.inheritance;

public class DemoInheritance {
    public static void main(String[] args) {
        // Membuat objek superclass
        ClassA superclass = new ClassA();

        // Membuat objek subclass
        ClassB subclass = new ClassB();

        System.out.println("=== SUPERCLASS ===");
        superclass.x = 3;
        superclass.y = 4;
        superclass.tampilXY();

        System.out.println("\n=== SUBCLASS ===");
        // Member superclass dapat diakses dari subclass-nya
        subclass.x = 1;
        subclass.y = 2;
        subclass.tampilXY();

        // Member tambahan hanya ada di subclass
        subclass.z = 5;
        subclass.jumlahXY();
    }
}