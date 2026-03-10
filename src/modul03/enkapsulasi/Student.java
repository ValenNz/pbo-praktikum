package modul03.enkapsulasi;

public class Student {
    // Private attributes (enkapsulasi)
    private String nim;
    private String nama;
    private final Integer MAX_BALANCE = 10000;

    // Constructor
    Student(String paramNim, String paramNama) {
        nim = paramNim;
        nama = paramNama;
    }

    // Public methods untuk mengakses private data
    void sayHello() {
        System.out.println("Hello");
    }

    void sayGoodbye(String paramNama) {
        System.out.println("Goodbye " + paramNama + " remember to study!");
    }

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    void setNama(String nama) {
        this.nama = nama;
    }

    void setNim(String nim) {
        this.nim = nim;
    }

    Integer getMaxBalance() {
        return MAX_BALANCE;
    }
}
