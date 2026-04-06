package modul06.KeywordSuper;

public class Manager extends Employee {
    private String alamat;

    // Constructor dengan memanggil constructor parent
    public Manager(String nama, String s) {
        /* Memanggil constructor Employee */
        super(nama);
        alamat = s;
    }

    public void tampilAlamat() {
        /* Menginisialisasi variabel departemen yang ada pada superclass */
        super.departemen = "Personalia";

        /* Memanggil method tampilNama() yang ada pada superclass */
        super.tampilNama();

        /* Menampilkan variabel departemen yang telah diinisialisasi */
        System.out.println("alamat: " + alamat);
        System.out.println("departemen: " + super.departemen);
    }

    public static void main(String[] args) {
        /* Membuat objek Manager */
        Manager adi = new Manager("adi", "sukabirus");
        adi.tampilAlamat();
    }
}
