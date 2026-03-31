public class Product1 {
    public static void main(String[] args) {
        Product p = new Product("Apple", 20);

        Warehouse.zarlagaGargah(p, 5, "Bat");
        Warehouse.zarlagaGargah(p, 30, "Gan"); // not enough stock example
        Warehouse.zarlagaGargah(p, 3, "Enkhee");

        System.out.println("Final quantity: " + p.getQuantity());
    }
}
