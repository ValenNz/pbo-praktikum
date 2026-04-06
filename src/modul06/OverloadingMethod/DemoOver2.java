package modul06.OverloadingMethod;

public class DemoOver2 {
    public static void main(String[] args) {
        // Membuat dua objek Lagu
        Lagu d, e;
        d = new Lagu();
        e = new Lagu();

        // Memanggil IsiParam dengan 1 parameter (menggunakan overloading #1)
        d.IsiParam("Lagu 1");

        // Memanggil IsiParam dengan 2 parameter (menggunakan overloading #2)
        e.IsiParam("kepastian yang kutunggu", "GiGi");

        // Menampilkan hasil
        d.CetakKeLayar();
        e.CetakKeLayar();
    }
}