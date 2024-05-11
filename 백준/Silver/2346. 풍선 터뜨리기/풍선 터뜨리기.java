import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> list = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        sb.append("1 ");
        int temp = Integer.parseInt(st.nextToken());

        for (int i = 2; i <= n; i++) {
            list.add(new int[]{i, Integer.parseInt(st.nextToken())});
        }


        while (!list.isEmpty()) {
            if (temp > 0) {
                for (int j = 1; j < temp; j++) {
                    list.add(list.pollFirst());
                }

                int[] next = list.removeFirst();
                temp = next[1];
                sb.append(next[0]).append(" ");
            }
            else {
                for (int j = temp; j < -1; j++) {
                    list.addFirst(list.pollLast());
                }

                int[] next = list.removeLast();
                temp = next[1];
                sb.append(next[0]).append(" ");
            }
        }
        System.out.println(sb);

    }
}

