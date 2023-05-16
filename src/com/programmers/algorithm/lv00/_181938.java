package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */
public class _181938 {
    private static Scanner sc = null;

    public static void main(String[] args) {
        int answer = 0;
        answer = solution01();
        System.out.println(answer);

        answer = solution02();
        System.out.println(answer);
    }

    /* 첫번째 풀이 막 풀어보기 */
    private static int solution01() {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String res = String.valueOf(a).concat(String.valueOf(b));
        int res2 = (2 * a * b);
        int answer = 0;
        if (Integer.parseInt(res) > res2) {
            answer = Integer.parseInt(res);
        } else if(Integer.parseInt(res) < res2) {
            answer = res2;
        } else if (Integer.parseInt(res) < res2) {
            answer = Integer.parseInt(res);
        }
        return answer;
    }

    /* Math.max 함수 사용 해보기 */
    private static int solution02() {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // 1번 인자 문자열 a + b를 붙힌 값이 큰지, 2번 인자 2 * a * b 숫자가 더 큰지만 구하면 되니까
        return Math.max(Integer.parseInt(String.valueOf(a).concat(String.valueOf(b))), (2 * a * b));
    }
}
