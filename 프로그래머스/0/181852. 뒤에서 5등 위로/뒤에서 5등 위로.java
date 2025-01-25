import java.util.Arrays;
import java.util.Collections;

class Solution {
    /**
     * num_list 중에서 가장 작은 5개는 제외시키고
     * 나머지 정수를 저장 하기
     */
    public int[] solution(int[] num_list) {
        
        // 오름차순 정렬 수행
        Arrays.sort(num_list);
        
        // 결과를 담을 공간을 지정
        // 10 -> 5 ==> 5개의 공간
        int[] answer = new int[num_list.length - 5];
        
        // 루프 수행
        int idx = 0;
        for (int i = 5; i < num_list.length; i++){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}