package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-05-09
 * @desc 대소문자 변경
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */
public class _181949 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        /**
         * KEY POINT
         * 1. Character.isUpperCase() 메서드를 통해 문자가 대문자인지 검증
         * 2. Character.isLowerCase() 메서드를 통해 문자가 소문자인지 검증
         * 3. Character.toUpperCase() 통해 대문자 변경
         * 4. Character.toLowerCase() 통해 소문자 변경
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
