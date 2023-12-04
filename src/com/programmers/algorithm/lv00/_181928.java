package com.programmers.algorithm.lv00;

import java.util.Arrays;

/**
 * @author ymkim
 * @since 2023-12-04
 * @desc : 이어 붙인 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181928
 *
 * [문제 번호]
 * 181928
 *
 * [문제]
 * 정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와
 * 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class _181928 {

    public static void main(String[] args) {
        System.out.println(solution01());
        System.out.println(solution02());
        System.out.println(solution03());
    }

    /**
     * for - loop 사용하여 홀수는 홀수대로 더하고, 짝수는 짝수대로 더한다
     */
    private static int solution01() {
        int [] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                System.out.println("A" + num_list[i]);
                odd.append(num_list[i]);
            } else {
                System.out.println("B" + num_list[i]);
                even.append(num_list[i]);
            }
        }
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }

    /**
     * Arrays.stream 사용
     * @return
     */
    private static int solution02() {
        int [] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        Arrays.stream(num_list).forEach(i -> {
            if (i % 2 != 0) odd.append(i);
            else even.append(i);
        });
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }

    /**
     * Arrays.stream 사용하는데 한줄로 더 줄여보기
     * @return
     */
    private static int solution03() {
        int [] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        Arrays.stream(num_list).forEach(i -> (i % 2 != 0 ? odd : even).append(i));
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}
