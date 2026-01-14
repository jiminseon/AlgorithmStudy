import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        int start = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (start < num) {
                for (int j = start + 1; j <= num; j++) {
                    stack.push(j);
                    sb.append("+\n");
                }
                start = num;
            } else {
                if (stack.peek() != num) {
                    System.out.print("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-\n");

        }

        System.out.print(sb);
    }
}
