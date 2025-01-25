import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];

        // 오름 차순 정렬
        Arrays.sort(num_list);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}