import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[21];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }

        for (int i = 0; i < 10; i++) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);
            swap(a, b, data);
        }

        for (int i = 1; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    static void swap(int a, int b, int[] data) {
        while (a < b) {
            int t = data[a];
            data[a] = data[b];
            data[b] = t;
            a++; b--;
        }
    }
}
