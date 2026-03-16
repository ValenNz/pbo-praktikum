package modul04.AccessModifier;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia objMns1 = new Manusia();

        objMns1.setNama("Markonah");
        objMns1.setUmur(76);

        System.out.println("Nama: " + objMns1.getNama());
        System.out.println("Umur: " + objMns1.getUmur());

        Manusia objMns2 = new Manusia();
        objMns2.setNama("Budi");
        objMns2.setUmur(25);

        System.out.println("\nNama: " + objMns2.getNama());
        System.out.println("Umur: " + objMns2.getUmur());

        // Coba akses langsung (akan error)
        // objMns1.nama = "Test"; // ERROR: nama has private access
        // objMns1.umur = 30;     // ERROR: umur has private access
    }
}