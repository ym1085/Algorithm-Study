import java.util.Arrays;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr2.length > arr1.length) {
            answer = -1;
        } else { // 동일한 경우?
            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();
            if (arr1Sum > arr2Sum) {
                answer = 1;
            } else if (arr2Sum > arr1Sum) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}