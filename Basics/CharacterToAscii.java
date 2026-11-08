import java.util.Scanner;

public class CharacterToAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Convert the character to its ASCII/Unicode integer value
        int asciiValue = (int) character;

        // Display the result
        System.out.println("The ASCII/Unicode value of '" + character + "' is: " + asciiValue);

        scanner.close();
    }
}
