package com.programmers.algorithm.lv00;

import java.util.Arrays;

/**
 * @author ymkim
 * @since 2023-12-05
 * @desc : 마지막 두 원소
 * https://school.programmers.co.kr/learn/courses/30/lessons/181927
 *
 * [문제 번호]
 * 181927
 *
 * [문제]
 * 정수 리스트 num_list가 주어질 때, 마지막 원소가 그전 원소보다 크면 마지막 원소에서
 * 그전 원소를 뺀 값을 마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여
 * return하도록 solution 함수를 완성해주세요.
 */
public class _181927 {

    /**
     * 문제 설명을 꼼꼼히 잘 읽고 정의해야 문제풀이에 도움이 된다.
     * 빠르게 문제를 풀기보다 문제를 먼저 정의하는 습관을 기르자.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution01()));;
    }

    private static int[] solution01() {
//        int [] num_list = { 2, 1, 6 }; // len : 3
        int [] num_list = { 5, 2, 1, 7, 5 }; // len : 3
        int len = num_list.length; // len : 3
        int [] answer = new int[len + 1]; // len : 4 => 마지막 공간에 새로운 값을 넣기 위해 + 1

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i]; // answer[i] => { 2, 1, 6, '0' }
        }

        if (num_list[len - 1] > num_list[len - 2]) {
            answer[len] = (num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            answer[len] = (num_list[num_list.length - 1] * 2);
        }

        return answer;
    }
}
