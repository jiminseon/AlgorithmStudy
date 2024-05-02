import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] stack = new int[10001];
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        while (n > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()) {
                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
            n--;
        }

        System.out.println(sb);

    }

    public static int size() {
        return size;
    }
    public static void push (int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if (size == 0) {
         return -1;
        }
        else {
            int temp = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return temp;
        }
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        if (size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }


}
