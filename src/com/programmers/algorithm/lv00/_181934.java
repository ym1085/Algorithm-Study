package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : 조건 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */
public class _181934 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        /**
         * 두 문자열 ineq와 eq가 주어집니다. ineq는 "<"와 ">"중 하나고, eq는 "="와 "!"중 하나입니다.
         * 그리고 두 정수 n과 m이 주어질 때, n과 m이 ineq와 eq의 조건에 맞으면 1을 아니면 0을 return하도록 solution 함수를 완성해주세요.
         */

        int answer = solution01();
        System.out.println(answer);
    }

    /* 첫번째 풀이 */
    private static int solution01() {
        sc = new Scanner(System.in);
        String ineq = sc.nextLine();
        String eq = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int answer = 0;
        if (ineq.concat(eq).equals(">=")) {
            answer = (n >= m) ? 1 : 0;
        } else if (ineq.concat(eq).equals("<=")) {
            answer = (n <= m) ? 1 : 0;
        } else if (ineq.concat(eq).equals(">!")) {
            answer = (n > m) ? 1 : 0;
        } else if (ineq.concat(eq).equals("<!")) {
            answer = (n < m) ? 1 : 0;
        }
        return answer;
    }
}
