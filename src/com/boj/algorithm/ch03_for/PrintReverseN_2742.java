package com.boj.algorithm.ch03_for;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 2742
 *
 * [문제]
 * 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 *
 * [출력]
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 */
public class PrintReverseN_2742 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        for (int i = length; i > 0; i--) {
            System.out.println(i);
        }
    }
}
