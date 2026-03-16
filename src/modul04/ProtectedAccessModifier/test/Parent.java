package modul04.ProtectedAccessModifier.test;

public class Parent {
    public int publicInt;
    private int privateInt;
    int defaultInt;
    protected int protectedInt;

    public void setPrivateInt(int privateInt) {
        this.privateInt = privateInt;
    }
}
