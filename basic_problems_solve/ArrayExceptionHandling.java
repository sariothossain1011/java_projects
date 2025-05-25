import java.util.Scanner;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        String str = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("Element at index " + index + ": " + numbers[index]);
            System.out.println("String length: " + str.length()); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds!");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access null reference.");
        } finally {
            System.out.println("Execution complete.");
        }

        scanner.close();
    }
}
