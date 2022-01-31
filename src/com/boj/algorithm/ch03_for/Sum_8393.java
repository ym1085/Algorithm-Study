package com.boj.algorithm.ch03_for;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 8393
 *
 * [문제]
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 *
 * [출력]
 * 1부터 n까지 합을 출력한다.
 */
public class Sum_8393 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        for ( int i = 1; i <= input; i++ ) {
//            System.out.println("i = " + i);
            sum += i;
        }
        System.out.println(sum);
    }
}
