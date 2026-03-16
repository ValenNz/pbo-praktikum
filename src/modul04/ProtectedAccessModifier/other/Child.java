package modul04.ProtectedAccessModifier.other;


import modul04.ProtectedAccessModifier.test.Parent;

public class  Child extends Parent {
    public void methodChild() {
        publicInt = 10;          // ✓ OK: public dapat diakses dari mana saja
        setPrivateInt(20);       // ✓ OK: akses private via setter method
        protectedInt = 30;       // ✓ OK: protected dapat diakses subclass (walaupun beda package)
        // defaultInt = 40;      // ✗ ERROR: default hanya bisa diakses dalam package yang sama
    }
}
