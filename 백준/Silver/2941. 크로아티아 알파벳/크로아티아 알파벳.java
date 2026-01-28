import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int len = input.length();

        int count = 0;
        for (int i = 0; i < len; i++) {
            char c = input.charAt(i);
            if (c == 'c' && i < len - 1) {
                if (input.charAt(i+1) == '=' || input.charAt(i+1) == '-') {
                    i++;
                }
            } else if (c == 'd' && i < len - 1) {
                if (i < len - 2 && input.charAt(i+1) == 'z' && input.charAt(i+2) == '=') {
                    i += 2;
                } else if (input.charAt(i+1) == '-') {
                    i++;
                }
            } else if ((c == 'l' || c == 'n') && i < len - 1) {
                if (input.charAt(i + 1) == 'j') {
                    i++;
                }
            } else if ((c == 's' || c == 'z') && i < len - 1) {
                if (input.charAt(i + 1) == '=') {
                    i++;
                }
            }
            count++;
        }
        System.out.print(count);

    }

}
