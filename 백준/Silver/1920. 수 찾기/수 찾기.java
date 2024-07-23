import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            boolean find = false;

            int start = 0;
            int end = a.length - 1;
            while (start <= end) {
                int mid_index = (start + end) / 2;
                int mid_vertex = a[mid_index];
                if (mid_vertex > target) {
                    end = mid_index - 1;
                } else if (mid_vertex < target) {
                    start = mid_index + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
