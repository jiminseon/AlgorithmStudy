class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer += "*";
        }
        String s = phone_number.substring(phone_number.length() - 4);
        
        answer += s;
        return answer;
    }
}