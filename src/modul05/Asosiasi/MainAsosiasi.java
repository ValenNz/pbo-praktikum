package modul05.Asosiasi;

public class MainAsosiasi {
    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa m = new Mahasiswa();
        m.setNim("130118383");
        m.setNama("Budi");

        // Membuat objek Dosen
        Dosen d = new Dosen();
        d.setKodeDosen("D001");
        d.setNamaDosen("Dr. Ahmad");

        // Dosen memberikan nilai ke Mahasiswa (asosiasi)
        d.giveScore(m, 90);

        // Menampilkan informasi
        System.out.println("=== HUBUNGAN ASOSIASI ===");
        System.out.println("NIM: " + m.getNim());
        System.out.println("Nama: " + m.getNama());
        System.out.println("Dosen: " + d.getNamaDosen());
        System.out.println("Nilai: " + d.getScore(m));
    }
}