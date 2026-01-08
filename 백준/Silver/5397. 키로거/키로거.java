import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator();

            for (char c : input.toCharArray()) {
                switch (c) {
                    case '<':
                        if (it.hasPrevious()) {
                            it.previous();
                        }
                        break;
                    case '>':
                        if (it.hasNext()) {
                            it.next();
                        }
                        break;
                    case '-':
                        if (it.hasPrevious()) {
                            it.previous();
                            it.remove();
                        }
                        break;
                    default:
                        it.add(c);
                        break;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : list) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
