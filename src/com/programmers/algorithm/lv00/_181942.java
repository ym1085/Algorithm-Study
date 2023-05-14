package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-14
 * @desc : 문자열 섞기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942?language=java
 */
public class _181942 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        // 길이가 같은 str1(aaaaa), str2(bbbbb) 존재
        // 두 문자열 각 문자 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열 만들어 return 'ababababab'
        testFixStr01();
    }

    private static String testFixStr01() {
        StringBuilder answer = new StringBuilder();
        sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            char A = str1.charAt(i);
            answer.append(A);
            char B = str2.charAt(i);
            answer.append(B);
        }
        return answer.toString();
    }
}
