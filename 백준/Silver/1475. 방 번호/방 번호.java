import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();

        int count = 0;
        int[] set = new int[9];
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            if (c == '6' || c == '9') {
                set[6]++;
            } else {
                set[c - '0']++;
            }
        }

        set[6] = (set[6] + 1) / 2;
        for (int i = 0; i < 9; i++) {
            if (set[i] > count) {
                count = set[i];
            }
        }

        System.out.print(count);
    }
}
