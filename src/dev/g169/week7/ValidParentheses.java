package dev.g169.week7;

import java.util.Stack;

/**
 * <h1>Valid Parentheses</h1>
 * <p>
 * <span>🔗 Link:
 * </span><span>https://leetcode.com/problems/valid-parentheses/description/</span>
 * </p>
 * <p>
 * <span>💪🏼 Difficulty: </span><strong style="color: green">Easy</strong>
 * </p>
 * <p>
 * <span>🏷️ Topics: </span><span>String, Stack</span>
 * </p>
 */
public class ValidParentheses {

    private static boolean isValid(String s) {
        // even numbers of characters
        if (s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                // stack should not get empty when characters are still left
                if (stack.isEmpty())
                    return false;

                char openParantheses = stack.pop();
                if (c == ')' && openParantheses != '(')
                    return false;
                if (c == '}' && openParantheses != '{')
                    return false;
                if (c == ']' && openParantheses != '[')
                    return false;
            }
        }

        // stack should be empty once characters are over
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "({{([{}()[[]{()[]{}}]])}})";

        System.out.println(isValid(s));
    }

}
