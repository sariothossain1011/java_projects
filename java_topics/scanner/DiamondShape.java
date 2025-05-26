package java_topics.scanner;

import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter diamond shape intiger value: ");
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
