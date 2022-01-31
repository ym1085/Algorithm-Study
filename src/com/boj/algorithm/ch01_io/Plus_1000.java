package com.boj.algorithm.ch01_io;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220121
 *
 * [문제 번호]
 *
 * 1000
 *
 * [문제]
 * 첫째 줄에 A와 B가 주어진다 ( 0 < A, b < 10 )
 *
 * 첫째 줄에 A + B를 출력한다
 */
public class Plus_1000 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}
