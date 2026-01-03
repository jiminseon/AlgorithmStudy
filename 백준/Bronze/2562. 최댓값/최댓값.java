import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int idx = 0;
        int[] data = new int[9];
        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(br.readLine());

            if (max < data[i]) {
                max = data[i];
                idx = i;
            }
        }

        System.out.println(data[idx]);
        System.out.println(idx+1);

    }
}
