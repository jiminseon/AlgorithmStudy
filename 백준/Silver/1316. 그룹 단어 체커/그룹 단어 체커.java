import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            boolean[] visited = new boolean[26];
            boolean isGroup = true;

            for (int j = 0; j < input.length(); j++) {
                if (visited[input.charAt(j) - 'a']) {
                    isGroup = false;
                    break;
                }
                if (j < input.length() - 1 && (input.charAt(j) != input.charAt(j+1))) {
                    visited[input.charAt(j) - 'a'] = true;
                }
            }
            if (isGroup) {
                count++;
            }
        }

        System.out.print(count);
    }

}
