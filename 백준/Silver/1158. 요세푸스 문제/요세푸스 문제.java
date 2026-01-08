import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i+1);
        }

        int idx = 0;
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!list.isEmpty()) {
            idx = (idx + k - 1) % list.size();
            sb.append(list.remove(idx));
            if (!list.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.print(sb);

    }
}
