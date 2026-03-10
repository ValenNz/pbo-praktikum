package modul03;

public class MainApp {
    public static void main(String[] args) {
        var student1 = new Student("103072430008", "Nuevalen Refitra Alswando");
        // Student student2 = new Student();

        // student1.nim = "1234";
        // student1.nama = "Dani";
        // student1.MAX_BALANCE = 20000;

        System.out.println(student1.nim);
        System.out.println(student1.nama);

        student1.sayHello();
        student1.sayGoodbye("Joko");
        student1.getNama();
    }
}
