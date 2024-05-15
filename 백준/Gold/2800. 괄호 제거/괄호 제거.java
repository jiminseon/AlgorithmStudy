import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String str;
    static List<String> list;
    static Set<String> set;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        str = st.nextToken();
        list = new ArrayList<>();
        arr = new int[str.length()];
        set = new HashSet<>();

        int index=1;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='(')
                arr[i] = index++;
            else if(str.charAt(i)==')')
                arr[i] = --index;
        }

        dfs(0, new Stack<>(), new String());

        list.addAll(set);
        Collections.sort(list);

        for(int i=1; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    static void dfs(int dep, Stack<Integer> stack, String s) {
        if(dep == str.length()) {
            set.add(s);
            return;
        }

        if(str.charAt(dep)=='(') {
            stack.add(arr[dep]);
            dfs(dep+1, stack, s+'(');
            stack.pop();
            dfs(dep+1, stack, s);
        } else if(str.charAt(dep)==')') {
            if(!stack.isEmpty() && stack.peek() == arr[dep]) {
                stack.pop();
                dfs(dep+1, stack, s+')');
                stack.add(arr[dep]);
            }else
                dfs(dep+1, stack, s);
        } else {
            dfs(dep+1, stack, s+str.charAt(dep));
        }
    }
}
