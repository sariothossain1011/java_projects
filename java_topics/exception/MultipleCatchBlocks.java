package exception;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        try {
            int[] arr = new int[7];
            
            arr[4] = 30 / 0; 
            System.out.println("First print statement in try blocks");
          
        } catch (ArithmeticException e) {
            
            System.out.println("Warning: Arithmetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Warning: Array Index Out Of Bounds Exception");
        } catch (Exception e) {
            System.out.println("Warning: Some other Exception");
        }
        System.out.println("Out of try...catch blocks");
        
    }
}
