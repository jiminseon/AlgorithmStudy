import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static char[][] board;
    static int[][] fire;
    static int[][] jihun;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new char[n][m];
        fire = new int[n][m];
        jihun = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(fire[i], -1);
            Arrays.fill(jihun[i], -1);
        }

        Queue<int[]> fireQ = new ArrayDeque<>();
        Queue<int[]> jihunQ = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'F') {
                    fireQ.offer(new int[]{i, j});
                    fire[i][j] = 0;
                }
                if (board[i][j] == 'J') {
                    jihunQ.offer(new int[]{i, j});
                    jihun[i][j] = 0;
                }
            }
        }


        while (!fireQ.isEmpty()) {
            int[] cur = fireQ.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m ) continue;
                if (fire[nx][ny] >= 0 || board[nx][ny] == '#') continue;

                fire[nx][ny] = fire[x][y] + 1;
                fireQ.offer(new int[]{nx, ny});
            }
        }

        while (!jihunQ.isEmpty()) {
            int[] cur = jihunQ.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                    System.out.println(jihun[x][y] + 1);
                    return;
                }

                if (jihun[nx][ny] >= 0 || board[nx][ny] == '#') continue;

                int nt = jihun[x][y] + 1;
                if (fire[nx][ny] != -1 && fire[nx][ny] <= nt) continue;

                jihun[nx][ny] = nt;
                jihunQ.offer(new int[]{nx, ny});
            }
        }

        System.out.println("IMPOSSIBLE");

    }
}
