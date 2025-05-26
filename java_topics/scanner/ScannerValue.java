package java_topics.scanner;

import java.util.Scanner;

public class ScannerValue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter a intiger number: ");
            int intNum = scan.nextInt();

            System.out.println("The number is: " + intNum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Code run successfully!");
        }
    }
}
