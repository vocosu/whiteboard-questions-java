package hackerrank.stacksandqueues;

import java.util.Stack;
/*
Difficulty: Medium
https://www.hackerrank.com/challenges/balanced-brackets/problem

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket
(i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) of the exact same type.
There are three types of matched pairs of brackets: [], {}, and ().

Complete the function isBalanced that returns a boolean if the string is balanced or not.

Sample Input
{[()]}
{[(])}
{{[[(())]]}}

Sample Output:
YES
NO
YES
 */
public class BalancedBrackets {
    /*
    Time complexity: O(n)
    */
    public boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            switch (character) {
                case '{':
                case '[':
                case '(':
                    stack.push(character);
                    break;
                case '}':
                    if (stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.pop() != '(') {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }
}
