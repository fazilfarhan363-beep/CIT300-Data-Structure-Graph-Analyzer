import java.util.ArrayList;
import java.util.List;

/** Stack implemented using a dynamic list (LIFO). */
public class StackOperations {
    private final List<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
        System.out.println(value + " pushed onto stack.");
    }

    public Integer pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        int value = stack.remove(stack.size() - 1);
        System.out.println("Popped: " + value);
        return value;
    }

    public Integer peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public void display() {
        if (stack.isEmpty()) System.out.println("Stack is empty.");
        else System.out.println("Stack (bottom to top): " + stack);
    }
}
