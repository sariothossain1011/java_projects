import java.util.*;

public class BubbleSortDescending03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        try {
            System.out.println("Enter 10 Integers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            System.out.println("Sorted array in descending order:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}