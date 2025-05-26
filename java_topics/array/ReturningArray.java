package java_topics.array;

public class ReturningArray {
    static int[] get(){
        return  new int[]{10,20,30,40,50};
    }
    public static void main(String[] args) {

        int array[] = get();

        for(int i : array){
            System.out.println(i);
        }
        
    }
}
