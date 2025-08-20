import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String[] start = st.nextToken().split(":");
            String[] end = st.nextToken().split(":");

            int startSec = toSeconds(
                    Integer.parseInt(start[0]),
                    Integer.parseInt(start[1]),
                    Integer.parseInt(start[2])
            );

            int endSec = toSeconds(
                    Integer.parseInt(end[0]),
                    Integer.parseInt(end[1]),
                    Integer.parseInt(end[2])
            );

            int totalCount = 0;
            if (startSec > endSec) { // 자정 넘김
                totalCount += countDivisibleBy3(startSec, toSeconds(23, 59, 59));
                totalCount += countDivisibleBy3(0, endSec);
            } else { // 일반적인 경우
                totalCount += countDivisibleBy3(startSec, endSec);
            }
            System.out.println(totalCount);
        }
    }

    public static int countDivisibleBy3(int startSec, int endSec) {
        int count = 0;
        for (int t = startSec; t <= endSec; t++) {
            int h = t / 3600;
            int m = (t % 3600) / 60;
            int s = t % 60;

            // 각 자리 합 바로 계산
            int sum = (h / 10 + h % 10) + (m / 10 + m % 10) + (s / 10 + s % 10);
            if (sum % 3 == 0) count++;
        }
        return count;
    }

    public static int toSeconds(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }
}
