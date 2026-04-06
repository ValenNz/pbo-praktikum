package modul05.Komposisi;

public class MainKomposisi {
    public static void main(String[] args) {
        // Membuat objek Komputer (komponen dibuat otomatis)
        Komputer k1 = new Komputer("Intel", 3, "Samsung", "Logitech", "Wireless");

        System.out.println("=== HUBUNGAN KOMPOSISI ===");
        k1.DisplaySpec();

        // Komponen tidak dapat diakses langsung dari luar
        // k1.cpu.DisplaySpecCPU(); // ERROR: cpu has private access

        System.out.println("\nKomponen hanya hidup bersama objek Komputer");
        System.out.println("Jika Komputer dihapus, komponen juga ikut dihapus");
    }
}
