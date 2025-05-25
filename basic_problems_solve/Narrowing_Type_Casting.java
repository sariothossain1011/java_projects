public class Narrowing_Type_Casting {
    public static void main(String[] args) {
        double myDouble = 9.50;
        int myInt = (int) myDouble;

        System.out.println("Original double value: "+ myDouble);
        System.out.println("double to int converted value: "+myInt);
    }
}
