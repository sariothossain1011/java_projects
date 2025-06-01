package java_topics.file;

import java.io.*;

public class FileRead {
    
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("output.txt");
            System.out.println(reader.ready());
            reader.close();
        
        } catch (IOException e) {
              System.out.println("An error occurred");
        }
    }
}
