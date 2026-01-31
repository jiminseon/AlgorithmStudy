import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String cmd = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            Deque<Integer> q = new ArrayDeque<>();

            if (n > 0) {
                s = s.substring(1, s.length() - 1);
                StringTokenizer st = new StringTokenizer(s, ",");
                while (st.hasMoreTokens()) {
                    q.offer(Integer.parseInt(st.nextToken()));
                }
            }

            boolean reversed = false;
            boolean error = false;

            for (char ch : cmd.toCharArray()) {
                if (ch == 'R') {
                    reversed = !reversed;
                } else {
                    if (q.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (!reversed) {
                        q.poll();
                    } else {
                        q.pollLast();
                    }
                }
            }

            if (error) {
                sb.append("error\n");
                continue;
            }

            sb.append("[");
            while(!q.isEmpty()) {
                sb.append(!reversed ? q.poll() : q.pollLast());
                if (!q.isEmpty()) {
                    sb.append(",");
                }
            }
            sb.append("]\n");
        }
        System.out.print(sb.toString());
    }
}
