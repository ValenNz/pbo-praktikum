package modul07.Interface;

public class Invoice implements Payable {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;

    // Four-argument constructor
    public Invoice(String part, String description, int count, double price) {
        partNumber = part;
        partDescription = description;
        setQuantity(count); // validate and store quantity
        setPricePerItem(price); // validate and store price per item
    }

    // Setter dan Getter untuk partNumber
    public void setPartNumber(String part) {
        partNumber = part;
    }

    public String getPartNumber() {
        return partNumber;
    }

    // Setter dan Getter untuk partDescription
    public void setPartDescription(String description) {
        partDescription = description;
    }

    public String getPartDescription() {
        return partDescription;
    }

    // Setter untuk quantity dengan validasi
    public void setQuantity(int count) {
        quantity = (count < 0) ? 0 : count; // quantity cannot be negative
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter untuk pricePerItem dengan validasi
    public void setPricePerItem(double price) {
        pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    // Return String representation of Invoice Object
    @Override
    public String toString() {
        return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f",
                "invoice", "part number", getPartNumber(), getPartDescription(),
                "quantity", getQuantity(), "price per item", getPricePerItem());
    }

    // Method required to carry out contract with interface Payable
    @Override
    public double getPaymentAmount() {
        return getQuantity() * getPricePerItem(); // calculate total cost
    }
}