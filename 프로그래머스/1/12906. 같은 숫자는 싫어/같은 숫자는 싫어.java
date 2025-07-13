import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;

        Stack<Integer> list = new Stack<Integer>();
        
        for(int i=0; i<arr.length; i++){
            if(i==0)
                list.push(arr[i]);
            else if(list.peek() !=arr[i]) 
                list.push(arr[i]);
    
        }
        
        answer = new int[list.size()];

        for(int i=list.size()-1; i >= 0;i--){
            answer[i] = list.pop();
        }
        
    
        return answer;
    }
}