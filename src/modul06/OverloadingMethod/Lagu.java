package modul06.OverloadingMethod;

public class Lagu {
    String pencipta;
    String judul;

    // Method IsiParam dengan 1 parameter (Overloading #1)
    void IsiParam(String param1) {
        judul = param1;
        pencipta = "Tidak dikenal";
    }

    // Method IsiParam dengan 2 parameter (Overloading #2)
    void IsiParam(String param1, String param2) {
        judul = param1;
        pencipta = param2;
    }

    // Method untuk menampilkan informasi
    void CetakKeLayar() {
        System.out.println("Judul: " + judul + ", pencipta: " + pencipta);
    }
}