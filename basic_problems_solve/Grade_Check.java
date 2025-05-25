public class Grade_Check {
    public static void main(String[] args) {

        int mark = 50;
        if (mark >= 80 && mark <= 100) {
            System.out.println(mark + " is a Grade A+");
        } else if (mark >= 75) {
            System.out.println(mark + " is a Grade A");
        } else if (mark >= 70) {
            System.out.println(mark + " is a Grade A-");
        } else if (mark >= 65) {
            System.out.println(mark + " is a Grade B+");
        } else if (mark >= 60) {
            System.out.println(mark + " is a Grade B");
        } else if (mark >= 55) {
            System.out.println(mark + " is a Grade B-");
        } else if (mark >= 50) {
            System.out.println(mark + " is a Grade C+");
        } else if (mark >= 45) {
            System.out.println(mark + " is a Grade C");
        } else if (mark >= 40) {
            System.out.println(mark + " is a Grade D+");
        } else if (mark < 40 && mark >= 1) {
            System.out.println(mark + " is a Grade F");
        } else {
            System.out.println("Invalid marks!");
        }
    }
}
