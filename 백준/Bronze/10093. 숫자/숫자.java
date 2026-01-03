import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        if (a > b) {
            System.out.println(a-b-1);
            for (int i = b + 1; i < a; i++) {
                System.out.print(i + " ");
            }
        } else if (a < b) {
            System.out.println(b-a-1);
            for (int i = a + 1; i < b; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(0);
        }


    }
}
