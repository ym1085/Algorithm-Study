class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String text = "";
        for (int i = 0; i < my_string.length(); i++) { // 6번
            text = text.concat(String.valueOf(my_string.charAt(i)));
            if (text.equals(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}