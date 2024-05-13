import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s = bf.readLine();
        Stack<Character> stack=new Stack<>();

        int result=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            }
            else if(s.charAt(i) == ')'){
                stack.pop();
                if(s.charAt(i-1) == '('){ // 레이저
                    result+=stack.size();
                }
                else if(s.charAt(i-1) == ')'){ //쇠막대기
                    result+=1;
                }
            }
        }

        System.out.print(result);
    }
}
