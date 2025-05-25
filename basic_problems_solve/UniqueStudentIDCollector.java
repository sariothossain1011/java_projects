import java.util.HashSet;
import java.util.Set;

public class UniqueStudentIDCollector {
    public static void main(String[] args) {
        // Create Unique Student IDs
        Set<String> studentIDs = new HashSet<>();

        // Add some IDs with Duplicates
        studentIDs.add("2024100010092");
        studentIDs.add("2024100010095");
        studentIDs.add("2024100010100");
        studentIDs.add("2024100010092"); // duplicate
        studentIDs.add("2024100010105");
        studentIDs.add("2024100010100"); // duplicate

        // Print the Unique Student IDs
        System.out.println("Unique Student IDs:");
        for (String id : studentIDs) { //for-each loop
            System.out.println(id);
        }
    }
}
