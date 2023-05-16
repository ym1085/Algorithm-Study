package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */
public class _181936 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        // 정수 number와 n, m이 주어진다
        // number가 n의 배수이면서 m의 배수 -> 1
        // 아니면 0
        int answer = solution01();
        System.out.println(answer);
    }

    /* 첫번째 풀이 */
    private static int solution01() {
        sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        // (조건 1) ? 결과1 : (조건2) ? 결과2 : 나머지 값
        return (number % n == 0 && number % m == 0) ? 1 : 0;
    }
}
