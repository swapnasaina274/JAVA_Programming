public class SymmetricMatrixCheck {

    /**
     * Checks if a given 2D array matrix is symmetric.
     */
    public static boolean isSymmetric(int[][] matrix) {
        // Step 1: Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;

        // Step 2: Check if the matrix is square
        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != rows) {
                return false; // Not a square matrix
            }
        }

        // Step 3: Check for symmetry across the main diagonal
        // We only need to check elements where j > i
        for (int i = 0; i < rows; i++) {
            for (int j = i + 1; j < rows; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // Mismatch found, not symmetric
                }
            }
        }

        return true; // No mismatches found, matrix is symmetric
    }

    public static void main(String[] args) {
        // Example 1: A symmetric matrix
        int[][] symmetricMat = {
            {1, 3, 5},
            {3, 2, 4},
            {5, 4, 1}
        };

        // Example 2: An asymmetric matrix
        int[][] asymmetricMat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Is symmetricMat symmetric? " + isSymmetric(symmetricMat));   // Outputs: true
        System.out.println("Is asymmetricMat symmetric? " + isSymmetric(asymmetricMat)); // Outputs: false
    }
}
