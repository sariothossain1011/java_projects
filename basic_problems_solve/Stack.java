// StackADT interface
interface StackADT {
    void push(int element); // Push

    int pop(); // Remove

    int size(); // size
}

// ArrayStack class
class ArrayStack implements StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    // ArrayStack Constructor
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push method
    @Override
    public void push(int element) {
        if (top >= capacity - 1) {
            System.out.println("Stack Overflow: Cannot push " + element);
            return;
        }
        stack[++top] = element;
    }

    // Pop method
    @Override
    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow: Cannot pop");
            return -1;
        }
        return stack[top--];
    }

    // Size method
    @Override
    public int size() {
        return top + 1;
    }

    // Display
    public void display() {
        if (top < 0) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class Stack {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Popped: " + stack.pop());
        System.out.println("Current size: " + stack.size());

        stack.display();
    }
}