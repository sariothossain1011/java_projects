package java_topics.array;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] array = { { 1, 2, 3 }, { 4, 5, 6 } };
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // System.out.print(array[i][j] + " ");
                array[i][j] = count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
