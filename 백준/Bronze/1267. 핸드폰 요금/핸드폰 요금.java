import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] data = new int[n];

        int y = 0;
        int m = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0 ; i< n; i++) {
                data[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            y += (data[i] / 30 + 1) * 10;
            m += (data[i] / 60 + 1) * 15;
        }

        if (y > m) {
            System.out.print("M" + " " + m);
        } else if (y < m) {
            System.out.print("Y" + " " + y);
        } else {
            System.out.print("Y" + " " + "M" + " " + y);
        }
    }
}
