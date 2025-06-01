package java_topics.file;

import java.io.*;
import java.util.Scanner;

public class File {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
