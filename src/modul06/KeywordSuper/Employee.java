package modul06.KeywordSuper;

public class Employee {
    private String name;
    String departemen;  // default access (package-private)

    // Constructor
    public Employee(String s) {
        name = s;
    }

    // Method untuk menampilkan nama
    public void tampilNama() {
        System.out.println("nama: " + name);
    }
}