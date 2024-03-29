package stack;

public class StackUsingLL {
    
    public static void main(String[] args) throws Exception {
        
        MyStack<Integer> stack = new MyStack<>();

        stack.push(12);
        stack.push(24);
        stack.push(36);

        int popped = stack.pop();
        System.out.println("Popped Element From Stack Is: " + popped);

        int peeked = stack.peek();
        System.out.println("Peeked Element From Stack Is: " + peeked);
    }
}