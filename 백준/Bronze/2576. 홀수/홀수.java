import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 7; i++) {
            int a = Integer.parseInt(br.readLine());

            if (a % 2 != 0) {
                sum += a;
                if (a <= min) {
                    min = a;
                }
            }
        }

        if (sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(-1);
        }

    }
}
