import java.util.*;

public class MatrixMaxValueFinder02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] matrixArr = new int[4][4];

        try {
            System.out.println("Enter 4*4 Matrix of integers: ");
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("Enter value at [" + i + "][" + j + "]: ");
                    matrixArr[i][j] = scan.nextInt();
                }
            }

            int maxValue = matrixArr[0][0];

            for (int i = 0; i < 4; i++) {
                int maxRow = matrixArr[i][0];
                for (int j = 0; j < 4; j++) {
                    if (matrixArr[i][j] > maxRow) {
                        maxRow = matrixArr[i][j];
                    }
                }
                System.out.println("Row: " + (i + 1) + " Max: " + maxRow);
                if (maxRow > maxValue) {
                    maxValue = maxRow;
                }
            }
            System.out.println("Highest value in the entre matrix: " + maxValue);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
