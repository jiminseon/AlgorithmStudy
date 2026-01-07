import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String value = br.readLine();
        LinkedList<Character> list = new LinkedList<>();
        for (char c : value.toCharArray()) {
            list.add(c);
        }

        int n = Integer.parseInt(br.readLine());

        ListIterator<Character> it = list.listIterator(list.size());
        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();

            switch (cmd.charAt(0)) {
                case 'L':
                    if (it.hasPrevious()) {
                        it.previous();
                    }
                    break;
                case 'D':
                    if (it.hasNext()) {
                        it.next();
                    }
                    break;
                case 'B':
                    if (it.hasPrevious()) {
                        it.previous();
                        it.remove();
                    }
                    break;
                case 'P':
                    it.add(cmd.charAt(2));
                    break;
            }
        }

        for (char c : list) sb.append(c);
        System.out.print(sb);

    }
}
