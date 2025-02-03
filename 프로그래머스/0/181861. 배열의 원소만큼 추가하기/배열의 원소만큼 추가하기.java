class Solution {
    public int[] solution(int[] arr) {
        // 배열을 담을 결과 변수 생성
        int arrSize = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSize += arr[i]; // 10
        }

        // 총 10개의 공간을 갖는 배열 방 초기화
        int[] answer = new int[arrSize];

        int idx = 0;
        for (int j = 0; j < arr.length; j++) { // 배열 공간만큼 반복
            int data = arr[j];
            for (int k = 0; k < data; k++) {
                answer[idx++] = data;
            }
        }
        
        return answer;
    }
}