class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int denom3 = denom1 * denom2;
        int numer3 = denom1 * numer2 + denom2 * numer1;
        int max = 1;
        
        for (int i = 2; i <= denom3 && i <= numer3; i++) {
            if (denom3 % i == 0 && numer3 % i == 0) {
                max = i;
            }
        }
        
        answer[0] = numer3 / max;
        answer[1] = denom3 / max;
        
        return answer;
    }
}