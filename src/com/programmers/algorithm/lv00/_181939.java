package com.programmers.algorithm.lv00;

/**
 * @author ymkim
 * @since 2023-05-14
 * @desc : 더 크게 합치기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class _181939 {

    public static void main(String[] args) {
        int answer = mergeStr01();
        System.out.println(answer);
    }

    /* 첫번째 풀이: 비고 */
    private static int mergeStr01() {
        int a = 9;
        int b = 91;
        int res1 = Integer.parseInt(String.valueOf(a).concat(String.valueOf(b)));
        int res2 = Integer.parseInt(String.valueOf(b).concat(String.valueOf(a)));

        int answer = 0;
        if (res1 > res2) {
            answer = res1;
        } else if(res2 > res1) {
            answer = res2;
        } else {
            answer = res1;
        }
        return answer;
    }
}
