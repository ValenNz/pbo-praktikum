package modul03.keyword;

public class DemoLagu {
    public static void main(String[] args) {
        Lagu a = new Lagu();
        a.IsiParam("God Will Make A Way", "Don Moen");
        a.cetakKeLayar();

        Lagu b = new Lagu();
        b.IsiParam("Sempurna", "Andra and The Backbone");
        b.cetakKeLayar();
    }
}
