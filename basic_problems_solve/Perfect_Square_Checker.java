import java.util.Scanner;

public class Perfect_Square_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the square root
        double sqrt = Math.sqrt(number);

        // Check if the square root is a whole number
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is NOT a Perfect Square.");
        }

        scanner.close();
    }
}
