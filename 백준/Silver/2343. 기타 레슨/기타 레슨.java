import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int start = 0;
        int end = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (start < a[i]) {
                start = a[i];
            }
            end = end + a[i];
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            int sum = 0;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (sum + a[i] > mid) { //27
                    count++;
                    sum = 0;
                }
                sum = sum + a[i];
            } 
            if (sum != 0) 
                count++;
            if (count > m)
                start = mid + 1;
            else 
                end = mid - 1;
        }
        System.out.println(start);
    }
}
