package modul04.NonAccessModifier;

public class FinalExample {
    public static void main(String[] args) {
        final int a = 5;
        final int b;
        b = 8;

        System.out.println("Nilai a: " + a);
        System.out.println("Nilai b: " + b);

        // a = 15;  // ERROR: final variable tidak bisa diubah
        // b = 21;  // ERROR: final variable sudah diinisialisasi
    }
}
