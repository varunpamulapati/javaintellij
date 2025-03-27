
import java.util.ArrayList;
public class StackWithArray<T> {

    public ArrayList<T> stack;

    public StackWithArray() {
        stack = new ArrayList<>();
    }
    public void push(T element) {
        stack.add(element);
    }
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }

}
