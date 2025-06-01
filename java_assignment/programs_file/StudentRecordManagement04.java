import java.util.*;
class Student {
    String id;
    String name;
    double[] scores = new double[5];
    double cgpa;

    void calculateCGPA() {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        cgpa = sum / 5.0;
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + cgpa);
        System.out.print("Student scores : ");
        for (double score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("____________________________________________");
    }
}

public class StudentRecordManagement04 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter number of students: ");
            int n = scan.nextInt();
            scan.nextLine();

            Student[] students = new Student[n];

            for (int i = 0; i < n; i++) {
                students[i] = new Student();
                System.out.println("\nEnter details for student " + (i + 1));

                System.out.print("Enter Name: ");
                students[i].name = scan.nextLine();

                System.out.print("Enter ID: ");
                students[i].id = scan.nextLine();

                System.out.println("Enter 5 exam scores:");
                for (int j = 0; j < 5; j++) {
                    students[i].scores[j] = scan.nextDouble();
                }
                scan.nextLine();
                students[i].calculateCGPA();
            }
            System.out.println("------ Student Records ------");
            for (Student student : students) {
                student.displayStudentInfo();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}