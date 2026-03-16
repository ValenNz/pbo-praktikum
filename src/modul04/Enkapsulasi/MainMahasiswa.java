package modul04.Enkapsulasi;

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[3];

        mhs[0] = new Mahasiswa("2024001", "Ahmad Rizki", "Teknik Informatika");
        mhs[0].setIpk(3.75);

        mhs[1] = new Mahasiswa("2024002", "Siti Nurhaliza", "Sistem Informasi");
        mhs[1].setIpk(3.90);

        mhs[2] = new Mahasiswa();
        mhs[2].setNim("2024003");
        mhs[2].setNama("Budi Santoso");
        mhs[2].setJurusan("Ilmu Komputer");
        mhs[2].setIpk(3.50);

        System.out.println("=== DAFTAR MAHASISWA ===\n");
        for(int i = 0; i < mhs.length; i++) {
            mhs[i].tampilkanInfo();
        }

        System.out.println("=== TEST VALIDASI IPK ===");
        mhs[0].setIpk(5.0);

        // Test akses langsung (akan error)
        // mhs[0].nim = "12345";  // ERROR: nim has private access
        // mhs[0].ipk = 4.5;      // ERROR: ipk has private access
    }
}