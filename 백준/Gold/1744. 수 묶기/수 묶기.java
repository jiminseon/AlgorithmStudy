import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pluspq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minuspq = new PriorityQueue<>();
        int one = 0;
        int zero = 0;
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            if (data > 1) {
                pluspq.add(data);
            } else if (data < 0) {
                minuspq.add(data);
            } else if (data == 1) {
                one++;
            } else {
                zero++;
            }
        }
        
        int sum = 0;
        while (pluspq.size() > 1) {
            int first = pluspq.remove();
            int second = pluspq.remove();
            sum = sum + first * second;
        }
        
        if (!pluspq.isEmpty()) {
            sum = sum + pluspq.remove();
        }
        
        while (minuspq.size() > 1) {
            int first = minuspq.remove();
            int second = minuspq.remove();
            sum = sum + first * second;
        }
        
        if (!minuspq.isEmpty()) {
            if (zero == 0) {
                sum = sum + minuspq.remove();
            }
        }
        
        sum = sum + one;
        System.out.println(sum);
    }
}
