import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] q;
    static int size = 0;
    static int front = 0;
    static int back = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        q = new int[n];
        StringTokenizer st;

        while (n > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    sb.append(pop()).append('\n');
                    break;

                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "front":
                    sb.append(front()).append('\n');
                    break;

                case "back":
                    sb.append(back()).append('\n');
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
        q[back] = item;
        back++;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }
        else {
            int temp = q[front];
            size--;
            front++;
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

    public static int front() {
        if (size == 0) {
            return -1;
        }
        else {
            return q[front];
        }
    }

    public static int back() {
        if (size == 0) {
            return -1;
        }
        else {
            return q[back -1];
        }
    }

}
