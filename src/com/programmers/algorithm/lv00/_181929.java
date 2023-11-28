package com.programmers.algorithm.lv00;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author ymkim
 * @since 2023-11-28
 * @desc : 원소들의 곱과 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/181929
 *
 * [문제 번호]
 * 181929
 *
 * [문제]
 *
 * 정수가 담긴 리스트 num_list가 주어질 때, 모든 원소들의 곱이 모든 원소들의 합의 제곱보다
 * 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class _181929 {

    public static void main(String[] args) {
        System.out.println(solution1());
        System.out.println(solution2());
        System.out.println(solution3());
        System.out.println(solution4());
    }

    /**
     * 문제 흐름 보고 생각나는대로 풀어보기
     */
    private static int solution1() {
        // 내가 풀이한문제
        int [] num_list = {3, 4, 5, 2, 1};
        int A = 1;
        int B = 0;
        for (int i = 0; i < num_list.length; i++) {
            A *= num_list[i];
            B += num_list[i];
        }
        //System.out.println(A);
        //System.out.println(Math.pow(B,2));
        int answer = 0;
        if (A < Math.pow(B, 2)) {
            answer = 1;
        }
        //System.out.println(answer);
        return answer;
    }

    /**
     * Arrays.Stream 사용
     */
    private static int solution2() {
        // https://khys.tistory.com/11
        // reduce(초기값, 함수, 계산)
        int [] num_list = {3, 4, 5, 2, 1};
        int A = Arrays.stream(num_list).reduce(1, (a, b) -> a * b); // 배열의 모든 값 곱셈
        int B = Arrays.stream(num_list).sum(); // 배열의 모든 값 합산
        return A < Math.pow(B, 2) ? 1 : 0;
    }

    /**
     * Stream.of 사용
     */
    private static int solution3() {
        Integer A = Stream.of(3, 4, 5, 2, 1).reduce(1, (a, b) -> a * b);
        Integer B = Stream.of(3, 4, 5, 2, 1).reduce(0, (a, b) -> a + b);
        return A < Math.pow(B, 2) ? 1 : 0;
    }

    /**
     * 한줄로 만들어보기
     */
    private static int solution4() {
        return Stream.of(3, 4, 5, 2, 1)
                .reduce(1, (a, b) -> a * b) < Math.pow(Stream.of(3, 4, 5, 2, 1)
                .reduce(0, Integer::sum), 2) ? 1 : 0;
    }
}
