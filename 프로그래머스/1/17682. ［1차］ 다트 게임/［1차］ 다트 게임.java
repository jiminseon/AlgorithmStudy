import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int[] arr = new int[3];
        int idx = -1;

        for (int i = 0; i < dartResult.length(); i++) {
            char ch = dartResult.charAt(i);
            
            if (Character.isDigit(ch)) {
                idx++;
                int num = ch - '0';
                if (ch == '1' && i + 1 < dartResult.length() && dartResult.charAt(i                                                                 + 1) == '0') {
                    num = 10;
                    i++;
                }
                arr[idx] = num;
            }
            else if (ch == 'S' || ch == 'D' || ch == 'T') {
                if (ch == 'D') {
                    arr[idx] = arr[idx] * arr[idx];
                }
                else if (ch == 'T') {
                    arr[idx] = arr[idx] * arr[idx] * arr[idx];
                }
            }
            else if (ch == '*' || ch == '#') {
                if (ch == '*') {
                    arr[idx] *= 2;
                    if (idx > 0) {
                        arr[idx - 1] *= 2;
                    }
                } else { 
                    arr[idx] *= -1;
                }
            }
        }

        return arr[0] + arr[1] + arr[2];
    }
}
