import java.util.Date;
import java.util.Objects;

public class Expense {
    private final String productName;
    private final int amount;
    private final String receiver;
    private final Date date;

    public Expense(String productName, int amount, String receiver, Date date) {
        this.productName = Objects.requireNonNull(productName, "productName cannot be null");
        this.amount = amount;
        this.receiver = Objects.requireNonNull(receiver, "receiver cannot be null");
        this.date = new Date(Objects.requireNonNull(date, "date cannot be null").getTime());
    }

    public void printInfo() {
        System.out.println("=== Expense Information ===");
        System.out.println("Product Name: " + productName);
        System.out.println("Amount: " + amount);
        System.out.println("Receiver: " + receiver);
        System.out.println("Date: " + date);
    }
}
