import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int[] data = new int[5];
        for (int i = 0; i < 5; i++) {
            int a = Integer.parseInt(br.readLine());
            data[i] = a;
            sum += a;
        }
        Arrays.sort(data);

        System.out.println(sum / 5);
        System.out.println(data[2]);

    }
}
