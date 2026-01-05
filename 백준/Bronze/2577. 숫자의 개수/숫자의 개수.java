import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 1;
        for (int i = 0; i < 3; i++) {
            result *= Integer.parseInt(br.readLine());
        }

        int[] arr = new int[10];
        while (result / 10 > 0) {
            for (int i = 0; i < 10; i++) {
                if (i == result % 10) {
                    arr[i]++;
                }
            }
            result /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (i == result % 10) {
                arr[i]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
