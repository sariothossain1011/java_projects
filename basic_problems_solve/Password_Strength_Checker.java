import java.util.Scanner;

public class Password_Strength_Checker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (password.length() < 6) {
            System.out.println("Weak Password");
        } else {
            System.out.println("Strong Password");
        }

        scanner.close();
    }
}
