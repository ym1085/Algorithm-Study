package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */
public class _181937 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        int answer = solution01();
        System.out.println(answer);
    }

    /* 첫번째 풀이 */
    private static int solution01() {
        // 정수 num과 n이 매개변수로 주어질 때, num이 n의 배수이면 1을 return, 그렇지 않으면 0을 return
        sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        return num % n == 0 ? 1 : 0;
    }
}
