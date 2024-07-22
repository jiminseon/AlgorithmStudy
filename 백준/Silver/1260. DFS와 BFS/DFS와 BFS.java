import java.util.*;

public class Main {
    static boolean visited[];
    static ArrayList<Integer>[] a;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int start = scan.nextInt();
        a = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < m; i++) {
            int s = scan.nextInt();
            int e = scan.nextInt();
            a[s].add(e);
            a[e].add(s);
        }
        
        for (int i = 1; i <= n; i++) {
            Collections.sort(a[i]);
        }
        visited = new boolean[n + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[n + 1];
        BFS(start);
        System.out.println();
    }
    
    public static void DFS(int node) {
        System.out.print(node + " ");
        visited[node] = true;
        for (int i : a[node]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }
    
    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(node);
        visited[node] = true;
        
        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now + " ");
            for (int i : a[now]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
