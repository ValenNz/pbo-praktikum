package modul05.Komposisi;

public class Mouse {
    private String Merk;
    private String Type;

    public Mouse(String m, String t) {
        this.Merk = m;
        this.Type = t;
    }

    public void DisplaySpecMouse() {
        System.out.println("Mouse: " + this.Merk + ", " + this.Type);
    }
}