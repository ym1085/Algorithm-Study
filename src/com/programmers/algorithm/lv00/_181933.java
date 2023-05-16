package com.programmers.algorithm.lv00;

/**
 * @author ymkim
 * @since 2023-05-16
 * @desc : flag에 따라 다른 값 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */
public class _181933 {

    public static void main(String[] args) {
        int a = -4;
        int b = 7;
        boolean flag = true;

        int answer = 0;
        if (flag) {
            answer = a + b;
        } else {
            answer = a - b;
        }
        System.out.println(answer);

//        return (flag) ? a + b : a - b; //  이거 한줄이면 끝나는듯
    }
}
