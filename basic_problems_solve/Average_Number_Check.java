import java.util.Scanner;

public class Average_Number_Check {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the Thirt Number : ");
        int thirtNumber = scanner.nextInt();

        System.out.print("Enter the Fouth Number : ");
        int fouthNumber = scanner.nextInt();

        int avarageNumber = (firstNumber + secondNumber + thirtNumber + fouthNumber) / 4;

        System.out.print("The Avarage Number is: " + avarageNumber);

        scanner.close();
    }
}
