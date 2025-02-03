class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
            char c = myString.charAt(i);
            if (c == 'A') {
                sb.append("B");
            } else if (c == 'B') {
                sb.append("A");
            }
        }
        
        int answer = 0;
        if (sb.toString().contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}