package modul03;

public class Student {
    String nim;
    String nama;

    final Integer MAX_BALANCE = 10000;

    Student(String paramNim, String paramNama){
        nim = paramNim;
        nama = paramNama;
    }

    void sayHello() {
        System.out.println("Hello");
    }

    void sayGoodbye(String paramNama) {
        System.out.println("Goodbye " + paramNama + " remember...");
    }

    String getNama(){
        return nama;
    }
}
