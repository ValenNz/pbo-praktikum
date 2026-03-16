package modul04.NonAccessModifier;

public class FinalParent {
    public void publicMethod() {
        System.out.println("Public method");
    }

    public final void finalMethod() {
        System.out.println("Final method - cannot be overridden");
    }
}
