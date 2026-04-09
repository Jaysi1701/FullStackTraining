package day3;

public class MultiArrayDemo {
    public static void main(String[] args) {

        // 2D array (matrix)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Access element
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        // Traverse matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Size
        System.out.println("Rows: " + matrix.length);
        System.out.println("Columns: " + matrix[0].length);
    }
}