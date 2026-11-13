public class SkipMultiples {
    public static void main(String[] args) {
        int skipMultiple = 3; // Change this value to skip multiples of a different number

        for (int i = 1; i <= 10; i++) {
            // Check if 'i' is a multiple of 'skipMultiple'
            if (i % skipMultiple == 0) {
                continue; // Skip the rest of the loop for this iteration
            }
            System.out.println("Number: " + i);
        }
    }
}
