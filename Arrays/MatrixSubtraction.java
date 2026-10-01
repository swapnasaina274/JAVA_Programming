public class MatrixSubtraction {
    public static void main(String[] args) {
        // Define two matrices of matching dimensions (3x3)
        int[][] matrix1 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] matrix2 = {
            {5, 4, 3},
            {2, 1, 0},
            {1, 1, 1}
        };

        // Create a result matrix with the same dimensions
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] resultMatrix = new int[rows][columns];

        // Perform element-wise subtraction using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Resulting Matrix after Subtraction:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}
