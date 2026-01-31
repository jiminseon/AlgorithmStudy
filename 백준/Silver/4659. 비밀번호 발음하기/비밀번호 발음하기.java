import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";

        while (!(input = br.readLine()).equals("end")) {
            boolean isOk = false;
            int count = 0;
            char prev = '.';
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (isVowel(ch)) {
                    isOk = true;
                }

                if (isVowel(ch) != isVowel(prev)) {
                    count = 1;
                } else {
                    count++;
                }

                if (count > 2 || (prev == ch && (ch != 'e' && ch != 'o')) ) {
                    isOk = false;
                    break;
                }

                prev = ch;
            }
            if (isOk) {
                System.out.println("<" + input + ">" + " is acceptable.");
            } else {
                System.out.println("<" + input + ">" + " is not acceptable.");
            }

        }
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }


}
