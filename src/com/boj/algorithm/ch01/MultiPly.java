package com.boj.algorithm.ch01;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220122
 *
 * [문제 번호]
 *
 * 10998
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [출력]
 * 첫째 줄에 A×B를 출력한다.
 */
public class MultiPly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a * b);
    }
}
