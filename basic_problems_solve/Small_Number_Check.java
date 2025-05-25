import java.util.Scanner;

public class Small_Number_Check {
       public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the Thirt Number : ");
        int thirtNumber = scanner.nextInt();

        int smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirtNumber));

        System.out.print("The Smallest Number is: " + smallestNumber);
        scanner.close();
    }
}