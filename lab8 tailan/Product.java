import java.util.Objects;

public class Product {
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Decrease amount must be positive");
        }
        if (amount > quantity) {
            throw new IllegalArgumentException("Not enough stock to decrease");
        }
        this.quantity -= amount;
    }
}
