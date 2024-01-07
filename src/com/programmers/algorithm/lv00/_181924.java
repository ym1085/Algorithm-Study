package com.programmers.algorithm.lv00;

import java.util.Arrays;

/**
 * @author ymkim
 * @since 2024-01-07(일)
 * @desc : 수열과 구간 쿼리 3
 * https://school.programmers.co.kr/learn/courses/30/lessons/181924
 *
 * [문제 번호]
 * 181924
 *
 * [문제]
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [i, j] 꼴입니다.
 *
 * 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */
public class _181924 {

    public static void main(String[] args) {
        // 1차원 배열
        int [] arr = {0, 1, 2, 3, 4};

        // 2차원 배열[index로 사용]
        int [][] queries = {
                {0, 3}, // 0,0 | 0,1
                {1, 2}, // 1,0 | 1,1
                {1, 4}  // 2,0 | 2,1
        };

        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    private static int[] solution(int[] arr, int[][] queries) {
        int [] answer = {};

        // 정수 배열 arr + 2차원 배열 queries가 주어짐
        // queries의 원소는 각각 하나의 query를 나타냄 -> [i, j] 꼴

        // todo: 각 쿼리(query)마다 순서대로 arr[i] 값과 arr[j]의 값을 바꾼다?
        // 1 th : [0, 1, 2, 3, 4] - [[0, 3],[1, 2],[1, 4]]
        // 2 th : [3, 1, 2, 0, 4]
        // 3 th : [3, 2, 1, 0, 4]
        // 4 th : [3, 4, 1, 0, 2]

        // 기준 For - Loop -> arr
        for (int i = 0; i < queries.length; i++) {
            int idx1 = queries[i][0];
            int idx2 = queries[i][1];

            int tmp = arr[idx1];
            arr[idx1] = arr[idx2];
            arr[idx2] = tmp;
        }

        answer = arr;
        return answer;
    }
}

