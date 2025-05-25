import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Input a sentence
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();

        String[] words = sentence.split("\\s+");  // Split by whitespace

        // Create a Map to Store Word Frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Count the Frequency of each word
        for (String word : words) {
            word = word.toLowerCase();  //Normalize to Lowercase
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word-Frequency Pairs
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
