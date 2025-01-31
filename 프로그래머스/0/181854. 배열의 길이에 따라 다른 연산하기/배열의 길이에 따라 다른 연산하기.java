class Solution {
    public int[] solution(int[] arr, int n) {
        // result
        int[] answer = new int[arr.length];

        // 4번 Loop 수행
        for (int i = 0; i < arr.length; i++) {
            if (arr.length % 2 == 0) { // 배열 길이가 짞수인 경우
                answer[i] = (i % 2 != 0) ? arr[i] + n : arr[i];
            } else { // 배열 길이가 홀수인 경우
                answer[i] = (i % 2 == 0) ? arr[i] + n : arr[i];
            }
        }
        return answer;
    }
}