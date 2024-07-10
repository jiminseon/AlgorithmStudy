import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int dataNum = Integer.parseInt(st.nextToken());
        int qNum = Integer.parseInt(st.nextToken());
        long[] s = new long[dataNum + 1];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= dataNum; i++) {
            s[i] = s[i - 1]  + Integer.parseInt(st.nextToken());
        }
        
        for (int j = 0; j < qNum; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            System.out.println(s[b] - s[a - 1]);
        }


    }
}
