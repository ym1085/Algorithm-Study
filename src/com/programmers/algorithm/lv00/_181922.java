package com.programmers.algorithm.lv00;

import java.util.Arrays;

/**
 * @author ymkim
 * @since 2024-01-24(수)
 * @desc : 수열과 구간 쿼리 4
 * https://school.programmers.co.kr/learn/courses/30/lessons/181922
 *
 * [문제 번호]
 * 181922
 *
 * [문제]
 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다.
 * queries의 원소는 각각 하나의 query를 나타내며, [s, e, k] 꼴입니다.
 *
 * 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더합니다.
 *
 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
 */
public class _181922 {

    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 4, 3};
        int [][] queries = {
                {0, 4, 1}, // 0,0 | 0,1 | 0, 2
                {0, 3, 2}, // 1,0 | 1,1 | 1, 2
                {0, 3, 3}  // 2,0 | 2,1 | 2, 2
        };

        // arr 정수 배열과
        // queries 2차원 정수 배열이 주어진다
        // queries 의 원소는 각각 하나의 query를 나타낸다 [s, e, k] 꼴
        // 각 쿼리마다 s <= i <= e 인 모든 i에 대해 i가 k의 배수이면 arr[i]에 1을 더한다

        for ( int i = 0; i < queries.length; i++ ) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            for ( int j = s; j <= e; j++ ) {
                System.out.println("j = " + j + ", e = " + e);
                if ( j % k == 0 ) {
                    arr[j]++;
                }
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr));
    }
}

