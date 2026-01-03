import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[26];
        String input = sc.next();

        for (char c : input.toCharArray()) {
            arr[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
