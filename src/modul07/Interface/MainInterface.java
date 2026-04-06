package modul07.Interface;

public class MainInterface {

    static Shoe hightop;

    public static void init() {
        hightop = new Shoe();
    }

    public static void getInfo(Shoe item) {
        System.out.println("This Product is made by " + item.getMaker());
        System.out.println("It costs $" + item.getPrice(1) + '\n');
    }

    public static void orderInfo(Product item) {
        // Mengakses konstanta dari interface
        System.out.println("To order from " + item.MAKER + " call " + item.PHONE + ".");
        System.out.println("Each item costs $" + item.getPrice(1));
    }

    public static void main(String argv[]) {
        init();

        System.out.println("=== INTERFACE EXAMPLE ===\n");

        // Menggunakan Invoice yang mengimplementasikan Payable
        Invoice inv1 = new Invoice("CPU-001", "Processor Intel Core i7", 2, 4500000);
        Invoice inv2 = new Invoice("RAM-002", "DDR4 16GB", 4, 850000);

        System.out.println("Invoice 1:");
        System.out.println(inv1.toString());
        System.out.println("Payment Amount: Rp " + String.format("%,.2f", inv1.getPaymentAmount()));
        System.out.println();

        System.out.println("Invoice 2:");
        System.out.println(inv2.toString());
        System.out.println("Payment Amount: Rp " + String.format("%,.2f", inv2.getPaymentAmount()));
        System.out.println();

        // Menggunakan Shoe yang mengimplementasikan Product
        System.out.println("=== PRODUCT INTERFACE ===");
        getInfo(hightop);
        orderInfo(hightop);

        // Polymorphism dengan interface
        System.out.println("\n=== POLYMORPHISM WITH INTERFACE ===");
        Payable pay1 = new Invoice("MOUSE-003", "Wireless Mouse", 5, 150000);
        System.out.println("Payment via Payable reference: Rp " +
                String.format("%,.2f", pay1.getPaymentAmount()));
    }
}
