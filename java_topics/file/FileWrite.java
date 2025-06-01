package java_topics.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

      try {
          FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello,This is a file");
        writer.close();
        System.out.println("Successfully worte to the file");
      } catch (IOException e) {
        System.out.println("An error occurred");
      }

        
    }
}
