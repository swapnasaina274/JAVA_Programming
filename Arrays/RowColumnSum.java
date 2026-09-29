public class RowColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Sum of each row
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        // Sum of each column
        for (int j = 0; j < matrix[0].length; j++) {
            int columnSum = 0;

            for (int i = 0; i < matrix.length; i++) {
                columnSum += matrix[i][j];
            }

            System.out.println("Sum of column " + (j + 1) + " = " + columnSum);
        }
    }
}