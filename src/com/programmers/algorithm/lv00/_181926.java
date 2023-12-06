package com.programmers.algorithm.lv00;

/**
 * @author ymkim
 * @since 2023-12-06
 * @desc : 수 조작하기 1
 * https://school.programmers.co.kr/learn/courses/30/lessons/181926
 *
 * [문제 번호]
 * 181926
 *
 * [문제]
 * 정수 n과 문자열 control이 주어집니다.
 * control은 "w", "a", "s", "d"의 4개의 문자로 이루어져 있으며, control의 앞에서부터 순서대로 문자에 따라 n의 값을 바꿉니다.
 *
 * "w" : n이 1 커집니다
 * "s" : n이 1 작아집니다
 * "d" : n이 10 커집니다
 * "a" : n이 10 작아집니다
 *
 * 위 규칙에 따라 n을 바꿨을 때 가장 마지막에 나오는 n의 값을 return 하는 solution 함수를 완성해 주세요.
 */
public class _181926 {

    public static void main(String[] args) {
        solution01(0, "wsdawsdassw");
        solution02(0, "wsdawsdassw");
    }

    /**
     * 기본적인 IF 문과 for - loop 사용
     */
    private static int solution01(int n, String control) {
        int answer = 0;
        for (int i = 0; i < control.length(); i++) {
            //char[] charArray = control.toCharArray();
            char c = control.charAt(i);
            if (c == 'w') {
                n += 1;
            } else if (c == 's') {
                n -= 1;
            } else if (c == 'd') {
                n += 10;
            } else if (c == 'a') {
                n -= 10;
            }
        }
        System.out.println("n = " + n);
        answer = n;
        return answer;
    }

    private static int solution02(int n, String control) {
        int answer = 0;
        for (char c : control.toCharArray()) {
            answer = (c == 'w') ? n += 1 : (c == 's') ? n -= 1 : (c == 'd') ? n += 10 : (c == 'a') ? n -= 10 : 0;
        }
        System.out.println(answer);
        return answer;
    }
}
