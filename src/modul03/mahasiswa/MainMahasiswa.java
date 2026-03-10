package modul03.mahasiswa;

public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi atribut objek
        mhs1.nama = "Budi Santoso";
        mhs1.nim = 2024001;

        // Memanggil method
        mhs1.getNamaMahasiswa();

        // Membuat objek kedua
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Siti Aminah";
        mhs2.nim = 2024002;
        mhs2.getNamaMahasiswa();
    }
}
