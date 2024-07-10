import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] s = new long[n];
        long[] c = new long[m]; //조합
        long answer = 0;
        
        s[0] = sc.nextInt();
        for (int i = 1 ; i < n ; i++) {
            s[i] = s[i - 1] + sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int remainder = (int) (s[i] % m);
            // 나머지 0인 값들 정답에 더하기 
            if (remainder == 0) answer++;
            //나머지 값이 같은 index값 counting e.g c[0] = 3 0은 나머지값, 3은 개수
            c[remainder]++; 
        }
        
        for (int i = 0; i < m; i++) {
            if (c[i] > 1) {
                // 나머지가 같은 인덱스 중 2개를 뽑는 경우의 수 더하기 3C2 (combination)
                answer = answer + (c[i] * (c[i] - 1) / 2);
            }
        }
        System.out.println(answer);
    }
}
