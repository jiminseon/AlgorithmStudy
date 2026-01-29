import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        Arrays.fill(arr, -1);

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (arr[ch - 'a'] == -1) {
                arr[ch - 'a'] = input.indexOf(ch);
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

}
