package modul04.NonAccessModifier;

public class FinalChild extends FinalParent {
    @Override
    public void publicMethod() {
        System.out.println("Public method overridden");  // OK
    }

    // @Override
    // public void finalMethod() {  // ERROR: final method tidak bisa di-override
    //     System.out.println("This will cause error");
    // }
}
