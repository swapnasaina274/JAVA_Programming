public class Item_Price {
    public static void main(String[] args) {
        double price = 100.0;
        int quantity = 3;

        double subtotal = price * quantity;
        double discount = subtotal * 0.10;
        double finalTotal = subtotal - discount;

        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Total: " + finalTotal);
    }
}