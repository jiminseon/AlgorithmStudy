import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int[] data = new int[line.length];
        for (int i = 0; i < line.length; i++) {
            data[i] = Integer.parseInt(line[i]);
        }
        Arrays.sort(data);
        for (int c : data) {
            System.out.print(c + " ");
        }

    }
}
