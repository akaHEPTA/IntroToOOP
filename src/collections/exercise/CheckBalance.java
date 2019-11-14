package collections.exercise;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;

public class CheckBalance {

    public static void main(String[] args) {
        System.out.println(checkBalance2("if (a(4) > 9) { foo(a(2)); }"));
        System.out.println(checkBalance2("for  (i=0;i<(3};i++) { foo{));"));
        System.out.println(checkBalance2("if (x)  {"));
    }

    private static int checkBalance(String s) {
        ArrayDeque<Integer> stack1 = new ArrayDeque<>();
        ArrayDeque<Integer> stack2 = new ArrayDeque<>();
        int i = 0;
        try {
            for (i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') stack1.add(i);
                if (s.charAt(i) == '{') stack2.add(i);
                if (s.charAt(i) == ')') stack1.pop();
                if (s.charAt(i) == '}') stack2.pop();
            }
        } catch (NoSuchElementException e) {
            return i;
        } catch (NullPointerException e) {
            return i;
        }

        if (stack1.isEmpty() && stack2.isEmpty()) return -1;
        else return s.length() - 1;
    }

    private static int checkBalance2(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add(s.charAt(i));
            }

            if (s.charAt(i) == '{') {
                stack.add(s.charAt(i));
            }

            if (s.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return i;
                }
            }

            if (s.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return i;
                }
            }
        }

        if (stack.isEmpty()) return -1;
        else return s.length() - 1;
    }
}
