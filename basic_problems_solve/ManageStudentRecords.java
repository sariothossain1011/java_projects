
import java.util.ArrayList;
import java.util.Scanner;

// Student Class
class Student {
    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("________________________");
    }

    // Getter for Roll No
    public int getRollNo() {
        return rollNo;
    }
}

// StudentManagerList Class
class StudentManagerList {
    private ArrayList<Student> students;

    public StudentManagerList() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }
        for (Student student : students) {
            student.displayInfo();
        }
    }

    public void searchStudent(int rollNo) {
        boolean found = false;
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                System.out.println("Student found:");
                student.displayInfo();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with Roll No " + rollNo + " not found.");
        }
    }
}

public class ManageStudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagerList manager = new StudentManagerList();
        int choice;

        do {
            System.out.println(" ");
            System.out.println("____Student Management System____");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice Number(1/2/3/4): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int rollNo = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student student = new Student(rollNo, name, marks);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll No to Search: ");
                    int searchRollNo = scanner.nextInt();
                    manager.searchStudent(searchRollNo);
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}





