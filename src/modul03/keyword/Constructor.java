package modul03.keyword;

public class Constructor {
    private String pengarang;
    private String judul;

    // Constructor tanpa parameter
    private Constructor() {
        // this digunakan untuk memanggil konstruktor lain
        this("Rumah Kita", "GoodBles");
    }

    // Constructor dengan dua parameter
    private Constructor(String judul, String pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }

    private void cetakKeLayar() {
        System.out.println("Judul: " + judul + " Pengarang: " + pengarang);
    }

    public static void main(String[] args) {
        Constructor a, b;

        // Menggunakan constructor dengan parameter
        a = new Constructor("Jurassic Park", "Michael Crichton");

        // Menggunakan constructor tanpa parameter (yang memanggil constructor lain)
        b = new Constructor();

        a.cetakKeLayar();
        b.cetakKeLayar();
    }
}
