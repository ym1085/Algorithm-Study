package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-09
 * @desc : 홀짝 구분하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */
public class _181944 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }
    }
}
