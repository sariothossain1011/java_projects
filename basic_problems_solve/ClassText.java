import java.util.Scanner;

public class ClassText {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix values:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                matrix[i][j] = scan.nextInt();
            }
        }

        System.out.println("Maximum value in each row:");
        for (int i = 0; i < 3; i++) {
            int max = matrix[i][0];
            for (int j = 1; j < 3; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            System.out.println("Row " + (i + 1) + " max: " + max);
        }
    }
}
