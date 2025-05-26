package java_topics.array;

public class CloningArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Print original array:");
        for (int i : arr)
            System.out.println(i);

        System.out.println("Print Clone array:");
        int[] carr = arr.clone();
        for (int j : carr)
            System.out.println(j);

        System.out.println("Print both array:");
        System.out.println(arr == carr);
    }
}
