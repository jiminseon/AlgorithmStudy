import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Deque<Integer>  q = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }
        st = new StringTokenizer(br.readLine());
        int count = 0;
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());

            int idx = 0;
            for (int x : q) {
                if (x == target) break;
                idx++;
            }

            int size = q.size();
            int left = idx;
            int right = size - idx;

            if (left <= right) {
                for (int k = 0; k < left; k++) {
                    q.offerLast(q.pollFirst());
                    count++;
                }
            } else {
                for (int k = 0; k < right; k++) {
                    q.offerFirst(q.pollLast());
                    count++;
                }
            }

            q.pollFirst();
        }

        System.out.print(count);
    }
}
