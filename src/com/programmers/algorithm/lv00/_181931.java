package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-11-21
 * @desc : 동차수열의 특정한 항만 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181931
 *
 * [문제 번호]
 * 181931
 *
 * [문제]
 * 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
 *
 * 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
 *
 * 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.
 */
public class _181931 {

    // 등차수열 참고 : https://blog.naver.com/jamduino/220959928433
    // 수열 ==> 수의 나열
    // 2012, 2013, 2014, @, 2016, 2017
    // 여기서 '@' 에는 어떤게 들어갈까? ===> '2015'
    // 이처럼 특정한 '수'의 나'열' 을 수열이라 한다
    public static void main(String[] args) {
        // 다른 사람 풀이 : https://school.programmers.co.kr/learn/courses/30/lessons/181931/solution_groups?language=java
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // 3 (첫째 항)
        int d = sc.nextInt(); // 4 (공차)
//        boolean[] included = {true, false, false, true, true};
        boolean[] included = {false, false, false, true, false, false, false};
        System.out.println(solution(a, d, included));
    }

    private static int solution(int a, int d, boolean[] included) {
        int res = 0;
        for (int i = 1; i <= included.length; i++) {
            // an = a1 + (n - 1)d
            int A = a + (i - 1) * d;
            if (included[i - 1]) {
                res += A;
            }
        }
        return res;
    }
}
