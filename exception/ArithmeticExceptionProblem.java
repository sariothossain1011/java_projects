package exception;



public class ArithmeticExceptionProblem {

    public static void main(String[] args) {
        
        try {
            double div = 10/0;

            System.out.println("Success response: "+div);
            
        } catch (Exception e) {
            System.out.println("Error: " +e.getMessage());
        }
    }
}