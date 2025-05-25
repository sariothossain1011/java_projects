import java.util.Scanner;

public class Diamond_Shape {
        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer Number: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {

                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.err.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {

                System.err.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.err.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
