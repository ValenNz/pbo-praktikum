package modul04.ConstructorParameter;

public class Manusia {
    private String nama;
    private int umur;

    public Manusia() {
        System.out.println("Constructor default dipanggil");
    }

    public Manusia(String a) {
        nama = a;
        System.out.println("Constructor dengan 1 parameter dipanggil");
    }

    public Manusia(String a, int b) {
        nama = a;
        umur = b;
        System.out.println("Constructor dengan 2 parameter dipanggil");
    }

    public void setNama(String a) {
        nama = a;
    }

    public String getNama() {
        return nama;
    }

    public void setUmur(int a) {
        umur = a;
    }

    public int getUmur() {
        return umur;
    }
}
