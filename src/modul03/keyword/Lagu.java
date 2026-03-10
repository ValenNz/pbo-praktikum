package modul03.keyword;

public class Lagu {
    private String pencipta;
    private String judul;

    // Method dengan parameter yang sama nama dengan atribut
    public void IsiParam(String judul, String pencipta) {
        // Keyword 'this' digunakan untuk membedakan atribut dan parameter
        this.judul = judul;
        this.pencipta = pencipta;
    }

    public void cetakKeLayar() {
        if (judul == null && pencipta == null) {
            return;
        }
        System.out.println("Judul: " + judul + ", Pencipta: " + pencipta);
    }
}
