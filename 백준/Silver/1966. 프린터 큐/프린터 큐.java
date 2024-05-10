import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++) {
                q.offer(new int[]{i, Integer.parseInt(st.nextToken())});
            }

            int cnt = 0;

            while (!q.isEmpty()) {
                int[] front = q.poll();
                boolean isMax = true;

                for (int j = 0; j < q.size(); j++) {
                    if (front[1] < q.get(j)[1]) {

                        q.offer(front);
                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                cnt++;
                if (front[0] == m) {
                    break;
                }

            }

            sb.append(cnt).append('\n');

        }
        System.out.println(sb);
    }
}

