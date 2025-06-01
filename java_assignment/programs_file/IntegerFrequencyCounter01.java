import java.util.*;

public class IntegerFrequencyCounter01 {

    public static void main(String[] args) {

        Map<Integer, Integer> fequencyMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("Enter integers list (like 10 30 40...) :");
            String inputList = scan.nextLine();

            String[] tokens = inputList.split("\\s+");

            for (String token : tokens) {
                int number = Integer.parseInt(token);
                fequencyMap.put(number, fequencyMap.getOrDefault(number, 0) + 1);
            }

            System.out.println("Integer Frequencies:");
            for (Map.Entry<Integer, Integer> entry : fequencyMap.entrySet()) {
                System.out.println(entry.getKey() + " appears " + entry.getValue() + (entry.getValue() > 1 ? " times" : " time"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}