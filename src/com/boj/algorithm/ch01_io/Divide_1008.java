package com.boj.algorithm.ch01_io;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220122
 *
 * [문제 번호]
 *
 * 1008
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [출력]
 * 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
 */
public class Divide_1008 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float a = sc.nextInt(); // 4byte, 7-8자리 표현
//        float b = sc.nextInt();
        double a = sc.nextInt(); // 8byte, 16자리 표현 (유효자리수: 정밀도)
        double b = sc.nextInt();

        // 0.3333333333333333
        System.out.println(a / b);
    }
}
