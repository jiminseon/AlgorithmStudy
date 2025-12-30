import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] data = new int[9];
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            data[i] = a;
            sum += a;
        }
        Arrays.sort(data);

        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - data[i] - data[j] == 100) {
                    data[i] = Integer.MAX_VALUE;
                    data[j] = Integer.MAX_VALUE;
                    Arrays.sort(data);
                    for (int k = 0; k < 7; k++) {
                        System.out.println(data[k]);
                    }
                    return;
                }
            }
        }

    }
}
