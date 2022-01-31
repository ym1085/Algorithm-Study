package com.boj.algorithm.ch01_io;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220122
 *
 * [문제 번호]
 *
 * 10869
 *
 * [문제]
 * 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 *
 * [출력]
 * 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
 */
public class Calculation_10869 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1  = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println(plus(n1, n2));
        System.out.println(minus(n1, n2));
        System.out.println(multiplication(n1, n2));
        System.out.println(division(n1, n2));
        System.out.println(quotient(n1, n2));
    }

    public static int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int quotient(int a, int b) {
        return a % b;
    }
}
