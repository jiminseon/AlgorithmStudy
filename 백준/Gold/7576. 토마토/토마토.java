import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken()); 
        int n = Integer.parseInt(st.nextToken());

        int[][] tomato = new int[n][m];
        Queue<int[]> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                tomato[i][j] = Integer.parseInt(st.nextToken());
                if (tomato[i][j] == 1) {           
                    q.offer(new int[]{i, j});
                }
            }
        }

        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0], c = cur[1];

            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];

                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (tomato[nr][nc] != 0) continue;

                tomato[nr][nc] = tomato[r][c] + 1;
                q.offer(new int[]{nr, nc});
            }
        }

        int max = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (tomato[i][j] == 0) {
                    System.out.print(-1);
                    return;
                }
                max = Math.max(max, tomato[i][j]);
            }
        }
        
        System.out.print(max - 1);
    }
}
