import java.util.*;

class Solution {
    public List<String> solution(String[] names) {
        // 최대 5명씩 탑승 가능한 놀이기구를 타기위해 줄 서 있는 사람 목록 -> names 배열
        // names % 5 == 0, 5(idx)
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer.add(names[i]);
            }
        }
        return answer;
    }
}