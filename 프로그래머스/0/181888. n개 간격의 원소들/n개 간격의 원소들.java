import java.util.*;

class Solution {
    public List<Integer> solution(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        
        // [4, 2, 6, 1, 7, 6]
        // 4, 6, 7
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }
        return answer;
    }
}