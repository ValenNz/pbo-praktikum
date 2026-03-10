package modul03.array;

public class MainManusia {
    public static void main(String[] args) {
        // Membuat array dari objek Manusia
        Manusia[] manusia = new Manusia[4];

        // Inisialisasi setiap elemen array
        for (int i = 0; i < manusia.length; i++) {
            manusia[i] = new Manusia();
        }

        // Mengisi data setiap objek
        manusia[0].setInfo("Hermawan", 180);
        manusia[1].setInfo("Suciati", 160);
        manusia[2].setInfo("Boy", 170);
        manusia[3].setInfo("Neneng", 165);

        // Menampilkan informasi setiap objek
        System.out.println("=== DATA MANUSIA ===");
        manusia[0].info();
        manusia[1].info();
        manusia[2].info();
        manusia[3].info();

        // Atau menggunakan loop
        System.out.println("\n=== MENGGUNAKAN LOOP ===");
        for (int i = 0; i < manusia.length; i++) {
            manusia[i].info();
        }
    }
}
