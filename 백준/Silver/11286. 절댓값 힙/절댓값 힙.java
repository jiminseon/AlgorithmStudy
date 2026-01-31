import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> list = new PriorityQueue<>((a, b) -> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            if (absA == absB) {
                return a < b ? -1 : 1;
            }
            return absA - absB;
        });
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                if (list.isEmpty()) {
                    sb.append("0\n");
                } else {
                sb.append(list.poll() + "\n");
                }
            } else {
                list.offer(input);
            }
        }
        System.out.print(sb);

    }
}
