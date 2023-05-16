package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */
public class _181935 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        // 양의 정수 n이 매개변수로 주어질때, n이 홀수라면 n 이하의 홀수인 모든 양의 정수를 합 return
        // 1, 3, 5, 7
        int answer = solution01();
        System.out.println(answer);
    }

    /* 첫번째 풀이 */
    private static int solution01() {
        sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer = 0;
        if (n % 2 == 0) { // 짝수
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    answer += Math.pow(i, 2); // 제곱 구할때는 pow를 이용합시다
//                    answer += (i * 2);
                }
            }
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 != 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}
