import java.util.*;
import java.io.*;

class Solution {
    public static boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(')
                stack.add(c);
            else {
                if (stack.isEmpty()) return false;
                else stack.pop();
            }
        }

        if (!stack.isEmpty()) answer = false;

        return answer;
    
    }
}