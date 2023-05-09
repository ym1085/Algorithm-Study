package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-09
 * @desc : 문자열 돌리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */
public class _181945 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            System.out.println(c);
        }
    }
}
