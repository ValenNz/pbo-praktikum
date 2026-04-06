package modul05.Agregasi;

public class MainAgregasi {
    public static void main(String[] args) {
        // Membuat objek Jurusan
        Jurusan j = new Jurusan("IF", "Informatika");

        // Membuat objek Mahasiswa (dapat berdiri sendiri)
        Mahasiswa m1 = new Mahasiswa("130118383", "Budi");
        Mahasiswa m2 = new Mahasiswa("130118384", "Siti");
        Mahasiswa m3 = new Mahasiswa("130118385", "Ahmad");

        // Menambahkan mahasiswa ke jurusan (agregasi)
        j.AddMahasiswa(m1);
        j.AddMahasiswa(m2);
        j.AddMahasiswa(m3);

        // Menampilkan informasi
        System.out.println("=== HUBUNGAN AGREGASI ===");
        j.DisplayMahasiswa();

        // Mahasiswa masih dapat diakses meskipun tanpa jurusan
        System.out.println("\nMahasiswa dapat berdiri sendiri:");
        System.out.println(m1.GetNama() + " - " + m1.GetNIM());
    }
}
