package stack;

class Stack{

    int size, top;
    char[] a;

    Stack(int n){
        top = -1;
        size = n;
        a = new char[size];
    }

    boolean isEmpty(){
        return (top<0);
    }

    boolean push(char x)
    {
        if (top >= size)
        {
        System.out.println("Stack Overflow");
        return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }

    char pop()
    {
        if (top < 0)
        {
        System.out.println("Stack Underflow");
        return 0;
        }
        else
        {
            char x = a[top--];
            return x;
        }
    }
}

public class ReverseString {

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("ayiraboD laveK");

        reverse(s);

        System.out.println("Reversed String Is: " + s); 
    }

    private static void reverse(StringBuffer str) {

        int n = str.length();
        Stack stack = new Stack(n);

        for(int i = 0; i < n; i++){
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < n; i++)
        {
            char ch = stack.pop();
            str.setCharAt(i,ch);
        }
    } 

}
