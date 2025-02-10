class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        // ["progressive", "hamburger", "hammer", "ahocorasick"]
        for (int i = 0; i < my_strings.length; i++) { // 4번 돌린다
            String text = my_strings[i];
            
            answer += text.substring(parts[i][0], parts[i][1] + 1);
        }
        return answer;
    }
}