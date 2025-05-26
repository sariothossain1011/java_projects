package java_topics.array;

public class SingleDimensional {
    public static void main(String[] args) {

        //int[] singleArr = new int[5];
         int[] singleArr = {5,6,7,8,9};

        // singleArr[0] = 5;
        // singleArr[1] = 6;
        // singleArr[2] = 7;
        // singleArr[3] = 8;
        // singleArr[4] = 9;

        // for(int i=0; i<singleArr.length;i++){
        //     System.out.println(singleArr[i]);
        // }

        for (int i : singleArr) {
                 System.out.println(i);
        }

    }

}