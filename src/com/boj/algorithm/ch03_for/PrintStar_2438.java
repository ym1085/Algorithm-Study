package com.boj.algorithm.ch03_for;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 2438
 *
 * [문제]
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * [입력]
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * [출력]
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class PrintStar_2438 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for ( int i = 0; i < length; i++ ) { // 0, 1, 2, 3, 4...
            for ( int j = 0; j < i; j++ ) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
