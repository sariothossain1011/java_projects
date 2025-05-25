public class Largest_Number_Check {
    public static void main(String[] args) {
        int a = 30, b = 40, c = 20;
        if ((a > b) && (a > c)) {
            System.out.println("The Largest Number is " + a);
        } else if ((b > a) && (b > c)) {
            System.out.println("The Largest Number is " + b);
        } else {
            System.out.println("The Largest Number is " + c);
        }

    }
}
