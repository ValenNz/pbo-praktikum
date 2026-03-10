package modul03.enkapsulasi;

public class MainApp {
    public static void main(String[] args) {
        // Membuat objek Student
        var student1 = new Student("2301", "Dani");
        Student student2 = new Student("2302", "Rina");

        // Mengakses data melalui getter
        System.out.println("=== DATA STUDENT 1 ===");
        System.out.println("NIM: " + student1.getNim());
        System.out.println("Nama: " + student1.getNama());
        System.out.println("Max Balance: " + student1.getMaxBalance());

        System.out.println("\n=== DATA STUDENT 2 ===");
        System.out.println("NIM: " + student2.getNim());
        System.out.println("Nama: " + student2.getNama());

        // Memanggil methods
        System.out.println("\n=== MEMANGGIL METHODS ===");
        student1.sayHello();
        student1.sayGoodbye("Joko");
        student2.sayHello();

        // Mengubah data melalui setter
        System.out.println("\n=== SETTING ULANG DATA ===");
        student1.setNama("Dani Updated");
        student1.setNim("2301A");
        System.out.println("NIM Baru: " + student1.getNim());
        System.out.println("Nama Baru: " + student1.getNama());
    }
}
