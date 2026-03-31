import java.util.Date;

public class Warehouse {
    public static void zarlagaGargah(Product product, int amount, String receiver) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (receiver == null || receiver.isEmpty()) {
            throw new IllegalArgumentException("Receiver cannot be empty");
        }

        if (amount <= 0) {
            System.out.println("Error: Amount is invalid!");
            return;
        }

        if (product.getQuantity() < amount) {
            System.out.println("Error: Insufficient inventory!");
            return;
        }

        product.decreaseQuantity(amount);
        Expense z = new Expense(product.getName(), amount, receiver, new Date());
        z.printInfo();
        System.out.println("Remaining Stock: " + product.getQuantity());
    }
}
