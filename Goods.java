/**
 * Клас Товар — представляє одиницю товару
 */
public class Goods {
    private String barcode;
    private String expiry;

    public Goods(String barcode, String expiry) {
        this.barcode = barcode;
        this.expiry = expiry;
        System.out.println("Створено товар: " + barcode + ", строк придатності: " + expiry);
    }

    public String getInfo() {
        return "Товар: " + barcode + ", строк придатності: " + expiry;
    }
}
