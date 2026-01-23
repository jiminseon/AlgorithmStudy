import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long c = Long.parseLong(st.nextToken());

        System.out.println(POW(a, b, c));


    }
    static long POW(long a, long b, long m) {
        if (b == 1) return a % m;

        long val = POW(a, b / 2, m);
        val = (val * val) % m;

        if (b % 2 == 0) return val;
        return (val * a) % m;
    }
}
