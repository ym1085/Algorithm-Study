package com.programmers.algorithm.lv00;

import java.util.*;

/**
 * @author ymkim
 * @since 2023-05-14
 * @desc : 문자열 겁쳐쓰기 (변수명은 문제 그대로 snake_case 사용했습니다)
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */
public class _181943 {
    private static Scanner sc = null;

    /**
     * He11oWor1d
     * lloWorl
     * 2
     */
    public static void main(String[] args) {
        String answer = "";
        answer = testOverlappingStr01();
        System.out.println("[TEST CASE 01 => ] " + answer + "\n");
        System.out.println("[TEST CASE 01 => 완료 => 이어서 입력하세요]");

        answer = testOverlappingStr02();
        System.out.println("[TEST CASE 02 => ] " + answer + "\n");
        System.out.println("[TEST CASE 02 => 완료 => 이어서 입력하세요]");
    }

    /* 첫번째 풀이 */
    private static String testOverlappingStr01() {
        sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        String overwriteStr = sc.nextLine();
        int s = sc.nextInt();

        String answer = "";
        String first = myStr.substring(0, s); // 0번째 원소부터 파라미터로 받은 n까지만 문자 추출
        String last = myStr.substring((first + overwriteStr).length());
        answer = first + overwriteStr + last;
        return first + overwriteStr + last;
    }

    /* 두번째 문자 풀이 */
    private static String testOverlappingStr02() {
        sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        String overwrite_string = sc.nextLine();
        int s = sc.nextInt();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s; i++) {
            answer.append(my_string.charAt(i));
        }

        int j = 0;
        for (; j < overwrite_string.length(); j++) {
            // for ( 1 : 초기화식; 2 : 조건식; 4 : 증감식) {   3 : 실행 문장   }
            answer.append(overwrite_string.charAt(j));
        }

        int k = j + s;
        while (k < my_string.length()) {
            answer.append(my_string.charAt(k));
            k++;
        }
        return answer.toString();
    }
}
