public class MatrixMinMax {
    public static void main(String[] args) {
        // Define a sample 2D matrix
        int[][] matrix = {
            {5, 12, 18},
            {29, -3, 7},
            {14, 0, 22}
        };

        // Check if the matrix is empty to avoid errors
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("The matrix is empty.");
            return;
        }

        // Initialize min and max with the first element of the matrix
        int min = matrix[0][0];
        int max = matrix[0][0];

        // Traverse through the entire matrix
        for (int i = 0; i < matrix.length; i++) {       // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) { // Loop through columns
                
                // Update max if a larger element is found
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                
                // Update min if a smaller element is found
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        // Print the final results
        System.out.println("Largest element in the matrix: " + max);
        System.out.println("Smallest element in the matrix: " + min);
    }
}
