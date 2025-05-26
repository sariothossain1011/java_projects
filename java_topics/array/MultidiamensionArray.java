package java_topics.array;

public class MultidiamensionArray {

    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
