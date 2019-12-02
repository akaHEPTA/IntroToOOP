package collections.list;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class StackExamples {
    /**
     * Write a function called checkBalance that accepts a String
     * of source code and checks whether the braces/parentheses {, (
     * are balanced.
     * - Every ( or { must be closed by } or ) in the opposite order.
     * - Return the index at which an imbalance occurs, or -1 if balanced.
     * - if any ( or { are never closed, return the string's length
     * <p>
     * example)
     * checkBalance("if (a(4) > 9) { foo(a(2)); }") -> -1
     * checkBalance("for  (i=0;i<(3}; i++) { foo{)); )") -> 14
     * ^
     * checkBalance("if (x)  {") -> returns 8
     * ^
     */
    public static int checkBalance(String code) {
        Deque<Character> stack = new ArrayDeque<>();
        int length = code.length();
        for (int i = 0; i < length; i++) {
            char ch = code.charAt(i);
            switch (ch) {
                case '(':
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return i;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return i;
                    }
                    break;
                default:
                    break;
            }
        }
        if (!stack.isEmpty()) {
            return length;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(checkBalance("if (a(4) > 9) { foo(a(2)); }"));
        System.out.println(checkBalance("for  (i=0;i<(3}; i++) { foo{)); )"));

        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(10);
        System.out.println(s.peek()); // 10
        System.out.println(s.pop());  // 10
        s.push(3);
        s.push(5);
        System.out.println(s.pop());  // 5
        System.out.println(s.size()); // 2
        System.out.println(s.peek()); // 3
        s.push(8);
        System.out.println(s.pop()); // 8
        System.out.println(s.pop()); // 3
    }
}
