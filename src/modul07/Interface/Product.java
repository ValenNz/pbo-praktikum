package modul07.Interface;

public interface Product {
    // Konstanta - secara default: public static final
    String MAKER = "MyCorp";
    String PHONE = "555-123-4567";

    // Abstract method
    int getPrice(int id);
}