import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        
        if (scanner.hasNextInt()) {
            int dayNumber = scanner.nextInt();
            
            String day = switch (dayNumber) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid input! Please enter a number between 1 and 7.";
            };
            
            System.out.println(day);
        } else 
        {
            System.out.println("Invalid input! Please enter an integer.");
        }
        
        scanner.close();
    }
}