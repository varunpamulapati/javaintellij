
public class StackWithArrayExe {

    public static void main(String[] args) {
        StackWithArray<Integer> stack = new StackWithArray<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack: " + stack.stack);

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Peeked element: " + stack.peek());

        System.out.println("Is the stack empty? " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());
    }
}