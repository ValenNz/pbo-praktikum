package modul04.Enkapsulasi;
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jurusan;
    private double ipk;
    public Mahasiswa() {
        System.out.println("Mahasiswa object created");
    }
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = 0.0;
    }
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public double getIpk() {
        return ipk;
    }
    public void setIpk(double ipk) {
        if(ipk >= 0.0 && ipk <= 4.0) {
            this.ipk = ipk;
        } else {
            System.out.println("IPK tidak valid! Harus antara 0.0 - 4.0");
        }
    }
    public void tampilkanInfo() {
        System.out.println("=== INFO MAHASISWA ===");
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
        System.out.println();
    }
}
