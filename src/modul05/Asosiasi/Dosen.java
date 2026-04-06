package modul05.Asosiasi;

public class Dosen {
    private String kodeDosen;
    private String namaDosen;

    // Setter
    public void setKodeDosen(String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    // Getter
    public String getKodeDosen() {
        return this.kodeDosen;
    }

    public String getNamaDosen() {
        return this.namaDosen;
    }

    // Method asosiasi - memberikan nilai ke mahasiswa
    public void giveScore(Mahasiswa s, int nilai) {
        // Ini asosiasi, method milik class Mahasiswa dipanggil di class Dosen
        // tapi objek Student tidak menjadi atribut dari class Dosen
        s.setNilai(nilai);
    }

    // Method asosiasi - mengambil nilai dari mahasiswa
    public int getScore(Mahasiswa s) {
        // Ini asosiasi, method milik class Mahasiswa dipanggil di class Dosen
        return s.getNilai();
    }
}