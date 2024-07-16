import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> { //(최소힙)
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) {
                return o1 > o2 ? 1 : -1; //1일때 순서 바꾸고 -1일때는 순서 보존
            }
            else {
                return first - second; //양수면 순서 바꾸고 음수면 보존
            }
        });
        
        for (int i = 0; i < n; i++) {
            int request = Integer.parseInt(br.readLine());
            if (request == 0) {
                if (q.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(q.poll());
                }
            } else {
                q.add(request);
            }
        }
    }
}
