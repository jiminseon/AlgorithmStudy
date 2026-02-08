import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] miro = new int[n][m];
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = input.charAt(j) - '0';
            }
        }

        int result = bfs(miro, 0, 0, n, m);
        System.out.print(result);

    }

    static int bfs(int[][] miro, int sr, int sc, int n, int m) {
        int[] dr = {0, 0, 1, -1};
        int[] dc = {1, -1, 0, 0};
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        visited[sr][sc] = true;
        q.offer(new int[]{sr, sc, 1});

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int r = cur[0];
            int c = cur[1];
            int dist = cur[2];

            if (r == n - 1 && c == m - 1) {
                return dist;
            }
            for (int i = 0; i < 4; i++) {
                int nr = r + dr[i];
                int nc = c + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (!visited[nr][nc] && miro[nr][nc] == 1) {
                        q.offer(new int[]{nr, nc, dist+1});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return 1;
    }
}
