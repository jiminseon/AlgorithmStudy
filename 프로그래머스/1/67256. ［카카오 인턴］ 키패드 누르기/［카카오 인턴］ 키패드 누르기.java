import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        int left = 10;
        int right = 12;
        
        for (int num  : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            } else if (num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = num;
            } else {
                if (num == 0) {
                    num = 11;
                } 
                
                int leftDist = Math.abs(left - num) / 3 + Math.abs(left - num) % 3;
                int rightDist = Math.abs(right - num) / 3 + Math.abs(right - num) % 3;
                
                if (leftDist == rightDist) {
                    if (hand.equals("right")) {
                        answer += "R";
                        right = num;
                    } else {
                        answer += "L";
                        left = num;
                    }
                } else if (leftDist < rightDist) {
                    answer += "L";
                    left = num;
                } else {
                    answer += "R";
                    right = num;
                }
                
                
            }
        }
        
        System.out.println(answer);
        return answer;
    }
}