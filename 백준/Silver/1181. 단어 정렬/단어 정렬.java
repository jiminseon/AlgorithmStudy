import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] list = new String[n];
        for (int i = 0; i < n; i++) {
            list[i] = br.readLine();
        }

        Arrays.sort(list, (a,b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }
            return a.compareTo(b);
        });

        for (int i = 0; i < n; i++) {
            if ((i+1) < n && (!list[i].equals(list[i+1]))) {
                System.out.println(list[i]);
            }
        }
        System.out.println(list[n-1]);

    }
}
