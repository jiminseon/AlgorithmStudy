import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i = 1; i < n; i++) { // 삽입 정렬
            int insert_index = i;
            int insert_value = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] < a[i]) {
                    insert_index = j + 1;
                    break;
                }
                if (j == 0) {
                    insert_index = 0;
                }
            }
            for (int j = i; j > insert_index; j--) {
                a[j] = a[j - 1];
            }
            a[insert_index] = insert_value;
        }
        
        s[0] = a[0];
        for (int i = 1; i < n; i++) {
            s[i] = s[i - 1] + a[i];
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + s[i];
        }
        System.out.println(sum);
    }
}
