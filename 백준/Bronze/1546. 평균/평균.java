import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int a[] = new int[N];
        
        for (int i = 0; i< N; i++) {
            a[i] = sc.nextInt();
        }
        
        long sum = 0;
        long max = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] > max) max = a[i];
            sum = sum + a[i];
        } 
        
        System.out.println(sum * 100.0 / max / N);
    }
}
