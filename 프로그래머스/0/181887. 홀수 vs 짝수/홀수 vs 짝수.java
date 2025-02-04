import java.lang.Math;

class Solution {
    public int solution(int[] num_list) {
        // 홀수 번째 원소 합 == 짝수 번째 원소들의 합 ----> 큰 값을 return
        int answer = 0;
        
        int odd = 0; // 홀수
        int even = 0; // 짝수
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }
        answer = Math.max(odd, even);
        return answer;
    }
}