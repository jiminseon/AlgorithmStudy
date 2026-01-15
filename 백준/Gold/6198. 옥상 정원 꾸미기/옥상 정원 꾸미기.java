import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        long result = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            while (!stack.isEmpty() && stack.peek() <= num) {
                stack.pop();
            }
            result += stack.size();
            stack.push(num);
        }
        System.out.print(result);

    }
}
