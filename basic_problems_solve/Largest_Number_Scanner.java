import java.util.Scanner;

public class Largest_Number_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Use Math.max() to find the largest number
        double largest = Math.max(num1, Math.max(num2, num3));

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
