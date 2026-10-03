public class MatrixMultiplication {
    public static void main(String[] args) {
        // 1. Define two sample matrices (Matrix A: 2x3, Matrix B: 3x2)
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrixB = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // 2. Perform multiplication
        int[][] result = multiplyMatrices(matrixA, matrixB);

        // 3. Print the result
        if (result != null) {
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        } else {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
        }
    }

    public static int[][] multiplyMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        int rowsA = firstMatrix.length;
        int colsA = firstMatrix[0].length;
        int rowsB = secondMatrix.length;
        int colsB = secondMatrix[0].length;

        // Validation rule: columns of A must match rows of B
        if (colsA != rowsB) {
            return null;
        }

        // Initialize the output matrix with dimensions: rows of A x columns of B
        int[][] product = new int[rowsA][colsB];

        // Triple nested loop to calculate the dot products
        for (int i = 0; i < rowsA; i++) {         // Row tracker for A
            for (int j = 0; j < colsB; j++) {     // Column tracker for B
                for (int k = 0; k < colsA; k++) { // Element tracker for dot product
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        return product;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
