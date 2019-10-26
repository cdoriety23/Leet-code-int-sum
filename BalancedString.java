

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    System.out.println(isValid("{{[[((}}}))")); //false
        System.out.println(isValid("{{{(}}})"));//false
        System.out.println(isValid("()[]{}"));//true
        System.out.println(isValid("{[]}"));//true
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        if (s.equals("")) return true;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            } else if (ch == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            } else if (ch == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            }
        }
        return stack.empty();


    }






}
