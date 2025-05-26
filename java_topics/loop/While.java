package java_topics.loop;

public class While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            if (i == 8) {
                i++;
                continue;

            }

            System.out.println(i);
      i++;
        }
    }

}
