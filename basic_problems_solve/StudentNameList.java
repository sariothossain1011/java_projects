import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentNameList {
    public static void main(String[] args) {
        // Create Array List
        List<String> students = new ArrayList<>();

        // Add Names
        students.add("Sariot Hossain");
        students.add("Ali Ahamed");
        students.add("Khalid Omar");
        students.add("Md. Mustafizur");
        students.add("Md. Shariar");

        // Sort the Array List Alphabetically
        Collections.sort(students);

        // Print the Sorted List
        System.out.println("Sorted Student Names:");
        for (String name : students) { //for-each loop
            System.out.println(name);
        }
    }
}
