package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParanthesisExp {

    public static void main(String[] args) {

        String s = "([{}])";

        if(isBalanced(s)){
            System.out.println("Balanced.");
        }else{
            System.out.println("Not Balanced.");
        }
    }

    private static boolean isBalanced(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[' ){
                stack.push(ch);
                continue;
            }

            if(stack.isEmpty()){
                return false;
            }

            char check;

            switch(ch){
                case ')':
                    check = stack.pop();
                    if(check == '{' || check == '['){
                        return false;
                    }
                    break;
                case '}':
                    check = stack.pop();
                    if(check == '(' || check == '['){
                        return false;
                    }
                    break;
                case ']':
                check = stack.pop();
                if(check == '(' || check == '{'){
                    return false;
                }
                break;
            }
        }

        return (stack.isEmpty());
    }
}
