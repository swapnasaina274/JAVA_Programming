public class MatrixAddition {
    public static void main(String[] args) {
        // Define the dimensions of the matrices
        int rows = 2;
        int columns = 3;

        // Initialize the first matrix
        int[][] firstMatrix = {
            {2, 3, 4},
            {5, 2, 3}
        };

        // Initialize the second matrix
        int[][] secondMatrix = {
            {-4, 5, 3},
            {5, 6, 3}
        };

        // Create a result matrix to store the sum
        int[][] sumMatrix = new int[rows][columns];

        // Perform element-wise addition using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Print the resulting sum matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
