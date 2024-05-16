import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<int[]> stack = new Stack<>();
        for(int i = 1; i <= n; i++) {
            int top = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()) {
                if(stack.peek()[1] >= top) { //stack.peek()[1] 탑의 높이
                    System.out.print(stack.peek()[0] + " "); //(stack.peek()[0] i(탑의 위치)값
                    break;
                }
                stack.pop();
            }
            if(stack.isEmpty()) {
                System.out.print("0 ");
            }
            stack.push(new int[] {i, top});
        }
    }
}
