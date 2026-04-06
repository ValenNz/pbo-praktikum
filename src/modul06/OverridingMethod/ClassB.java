package modul06.OverridingMethod;

public class ClassB extends ClassA {
    @Override
    public void tampilkanKeLayar() {
        // Memanggil method milik superclass menggunakan keyword super
        super.tampilkanKeLayar();

        // Menambahkan implementasi khusus di subclass
        System.out.println("Method milik class B dipanggil...");
    }
}
