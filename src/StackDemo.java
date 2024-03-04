import java.util.Stack;
public class StackDemo { public static void main(String[] args) {
    Stack<Integer> stack = new Stack<>();
    // Push elements onto the stack
     stack.push(10);
     stack.push(20);
     stack.push(30);
     stack.push(40);
     stack.push(50);
    System.out.println("Stack elements: " + stack);
    // Pop elements from the stack
    System.out.println("Popped element: " + stack.pop());
    System.out.println("Stack elements after pop: " + stack);
    // Peek at the top element without removing it
    System.out.println("Top element (peek): " + stack.peek());
    // Check if the stack is empty
    System.out.println("Is the stack empty? " + stack.isEmpty());
    // Size of the stack
    System.out.println("Stack size: " + stack.size());
}
}