import java.util.*;

class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String concatenate(String a, String b) {
        return a + b;
    }
}

public class MultiFunctionalCalculator08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            // Integer addition
            System.out.print("Enter two integers to add: ");
            int int1 = scanner.nextInt();
            int int2 = scanner.nextInt();
            System.out.println("Result (int + int): " + calc.add(int1, int2));

            // Double addition
            System.out.print("Enter two decimal numbers to add: ");
            double double1 = scanner.nextDouble();
            double double2 = scanner.nextDouble();
            System.out.println("Result (double + double): " + calc.add(double1, double2));

            // Multiplication
            System.out.print("Enter two integers to multiply: ");
            int mul1 = scanner.nextInt();
            int mul2 = scanner.nextInt();
            System.out.println("Result (multiplication): " + calc.multiply(mul1, mul2));

            scanner.nextLine(); 

            // String concatenation
            System.out.print("Enter first string: ");
            String str1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            String str2 = scanner.nextLine();
            System.out.println("Result (concatenation): " + calc.concatenate(str1, str2));

        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
