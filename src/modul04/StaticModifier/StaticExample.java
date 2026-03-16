package modul04.StaticModifier;

public class StaticExample {
    public static int count = 0;

    public static void incrementCount() {
        count++;
    }

    public int instanceValue = 0;

    public static void main(String[] args) {
        System.out.println("Count awal: " + StaticExample.count);

        StaticExample.incrementCount();
        StaticExample.incrementCount();

        System.out.println("Count setelah increment: " + StaticExample.count);

        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();

        obj1.instanceValue = 10;
        obj2.instanceValue = 20;

        System.out.println("obj1.instanceValue: " + obj1.instanceValue);
        System.out.println("obj2.instanceValue: " + obj2.instanceValue);
        System.out.println("Static count (shared): " + StaticExample.count);
    }
}
