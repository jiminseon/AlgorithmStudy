import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        // 1. 원하는 상품과 개수를 HashMap에 저장
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        // 2. discount 배열에서 연속된 10일 구간 탐색
        for (int i = 0; i < discount.length - 9; i++) {
            HashMap<String, Integer> discountMap = new HashMap<>();
            
            // 현재 10일간의 상품 정보를 HashMap에 저장
            for (int j = 0; j < 10; j++) {
                discountMap.put(discount[i + j], discountMap.getOrDefault(discount[i + j], 0) + 1);
            }

            // 3. 원하는 상품 목록(wantMap)과 현재 10일간의 할인 목록(discountMap)을 비교
            if (wantMap.equals(discountMap)) {
                answer++;
            }
        }

        return answer;
    }
}