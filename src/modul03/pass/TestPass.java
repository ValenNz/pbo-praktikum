package modul03.pass;

public class TestPass {
    int i, j;

    // Constructor
    TestPass(int a, int b) {
        i = a;
        j = b;
    }

    // Passed by value dengan parameter tipe data primitif
    void calculate(int m, int n) {
        m = m * 10;
        n = n / 2;
        System.out.println("Di dalam method (by value):");
        System.out.println("m = " + m);
        System.out.println("n = " + n);
    }

    // Passed by reference dengan parameter tipe data class
    void calculate(TestPass e) {
        e.i = e.i * 10;
        e.j = e.j / 2;
        System.out.println("Di dalam method (by reference):");
        System.out.println("e.i = " + e.i);
        System.out.println("e.j = " + e.j);
    }
}
