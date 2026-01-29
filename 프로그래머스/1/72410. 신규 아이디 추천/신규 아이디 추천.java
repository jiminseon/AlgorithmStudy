class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        
        StringBuilder sb = new StringBuilder();
        for (char ch : new_id.toCharArray()) {
            if (Character.isLetterOrDigit(ch) || ch == '-' || ch == '_' || ch == '.') {
                sb.append(ch);
            }
        }
        
        String answer = sb.toString();
        while(answer.contains("..")) {
            answer = answer.replace("..", ".");
        }
        
        if(answer.startsWith(".")) {
            answer = answer.substring(1);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        if (answer.length() == 0) {
            answer = "a";
        }
        
        if (answer.length() > 15) {
            answer = answer.substring(0, 15);
        }
        if (answer.endsWith(".")) {
            answer = answer.substring(0, answer.length() - 1);
        }
        
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        
        
        return answer;
    }
}