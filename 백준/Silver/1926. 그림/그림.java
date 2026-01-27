import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] paper;
    static boolean[][] visited;
    static int max;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        paper = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paper[i][j] =  Integer.parseInt(st.nextToken());
            }
        }

        visited = new boolean[n][m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && paper[i][j] == 1) {
                    max = Math.max(max, bfs(paper, i, j, visited));
                    count++;
                }
            }
        }

        System.out.println(count);
        System.out.println(max);
    }

    static int bfs(int[][] paper, int r, int c, boolean[][] visited) {
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{r, c});
        visited[r][c] = true;
        int size = 0;

        while(!q.isEmpty()) {
            int[] cur = q.poll();
            size++;

            for (int i = 0; i < 4; i++) {
                int nr = cur[0] + dr[i];
                int nc = cur[1] + dc[i];
                if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                    if (!visited[nr][nc] && paper[nr][nc] == 1) {
                        q.offer(new int[]{nr,nc});
                        visited[nr][nc] = true;
                    }
                }
            }
        }
        return size;
    }

}
