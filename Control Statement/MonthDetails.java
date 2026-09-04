import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class MonthDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month number (1-12): ");

        if (scanner.hasNextInt()) {
            int monthNumber = scanner.nextInt();

            if (monthNumber >= 1 && monthNumber <= 12) {
                Month month = Month.of(monthNumber);
                
                // Capitalized month name (e.g., "January")
                String monthName = month.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
                
                // Get length for non-leap year (use month.length(true) for leap year)
                int days = month.length(Year.isLeap(Year.now().getValue()));

                System.out.println("Month: " + monthName);
                System.out.println("Days: " + days + (monthNumber == 2 ? " (29 in a leap year)" : ""));
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
        }

        scanner.close();
    }
}