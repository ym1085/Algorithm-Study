package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-09
 * @desc : 문자열 붙여서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181946
 */
public class _181946 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a.concat(b).trim());
    }
}
