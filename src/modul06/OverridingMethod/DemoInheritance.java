package modul06.OverridingMethod;

public class DemoInheritance {
    public static void main(String[] args) {
        // Membuat objek dari subclass ClassB
        ClassB subOb = new ClassB();

        // Memanggil method yang sudah di-override
        // Yang dieksekusi adalah method milik ClassB, bukan ClassA
        subOb.tampilkanKeLayar();
    }
}