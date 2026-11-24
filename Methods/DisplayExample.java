public class DisplayExample {

    // 1. Accepts an integer
    public static void display(int number) {
        System.out.println("Integer: " + number);
    }

    // 2. Accepts a string
    public static void display(String text) {
        System.out.println("String: " + text);
    }

    // 3. Accepts an integer and a string
    public static void display(int number, String text) {
        System.out.println("Integer: " + number + ", String: " + text);
    }

    public static void main(String[] args) {
        display(42);
        display("Hello, Java!");
        display(100, "Score");
    }
}
