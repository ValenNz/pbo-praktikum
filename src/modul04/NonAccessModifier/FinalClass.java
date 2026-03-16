package modul04.NonAccessModifier;

public final class FinalClass {
    public void someMethod() {
        System.out.println("This class cannot be extended");
    }
}

// class AnotherClass extends FinalClass {  // ERROR: FinalClass tidak bisa di-extend
// }