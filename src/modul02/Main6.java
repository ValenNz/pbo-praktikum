package modul02;

public class Main6 {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("a + b = " + (a + b));
        System.out.println("a % b = " + (a % b));

        boolean hasil = (a > b);
        System.out.println("Apakah a > b? " + hasil);

        a += b;
        System.out.println("Nilai a setelah += : " + a);
    }
}
