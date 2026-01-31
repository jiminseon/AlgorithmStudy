import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[n+1];
        arr[0] = false;
        for (int i = 1; i <= n; i++) {
            if (Integer.parseInt(st.nextToken()) == 0) {
                arr[i] = false;
            } else {
                arr[i] = true;
            }
        }

        int stNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < stNum; i++ ) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());

            if (gender == 1) {
                for (int j = num; j <= n; j += num) {
                    arr[j] = !arr[j];
                }
            } else {
                int l = num - 1;
                int r = num + 1;
                while (l > 0 && r < n + 1) {
                    if (arr[l] == arr[r]) {
                        arr[l] = !arr[l];
                        arr[r] = !arr[r];
                        l--;
                        r++;
                    } else {
                        break;
                    }
                }
                arr[num] = !arr[num];
            }
        }

        for (int i = 1; i <= n; i++) {
            System.out.print((arr[i] ? 1 : 0) + " ");
            if (i % 20 == 0) System.out.println();
        }


    }


}
