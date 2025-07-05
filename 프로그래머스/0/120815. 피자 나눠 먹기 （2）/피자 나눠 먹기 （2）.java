class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int i = 1;
        while ((n * i) % 6 != 0) {
            i++;
        }
        
        answer = (n * i) / 6;
        
        return answer;
    }
}