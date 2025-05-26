package java_topics.type_casting;

public class NarrowingCasting {

    public static void main(String[] args) {
        double doubleNum = 40.78;
        int intNum = (int) doubleNum;

        System.out.println("double value: " + doubleNum);
        System.out.println("double to intiger converted number: "+ intNum);
    }

}
