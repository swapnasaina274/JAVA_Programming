public class MatrixTranspose {
    public static void main(String[] args) {
        // Define a 2x3 matrix (2 rows, 3 columns)
        int[][] original = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = original.length;
        int columns = original[0].length;

        // The transpose matrix will have dimensions swapped (3 rows, 2 columns)
        int[][] transpose = new int[columns][rows];

        // Logic to transpose the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        // Print the original matrix
        System.out.println("--- Original Matrix ---");
        printMatrix(original);

        // Print the transposed matrix
        System.out.println("\n--- Transposed Matrix ---");
        printMatrix(transpose);
    }

    // Helper method to display the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
