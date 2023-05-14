package com.programmers.algorithm.lv00;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ymkim
 * @since 2023-05-14
 * @desc : 문자열 곱하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */
public class _181940 {
    private static Scanner sc = null;

    /**
     * 문자열이 하나 주어지고(apple), n 정수가 주어졌을때 해당 문자(apple)을 n번 돌려서 가져다 붙혀라
     *
     // Case 01. 배열 존재 -> 해당 배열의 각 원소를 -> 하나의 문자열(붙어있는)로 만들어야 하는 케이스
     // Case 02. 문자열 존재 -> n번 Loop 수행 해서 -> 하나의 문자열(apple)을 n번 붙혀서 출력
     */
    public static void main(String[] args) {
        String answer = "";
        answer = testLoopingByNum01();
        System.out.println(answer);

        answer = testLoopingByNum02();
        System.out.println(answer);
    }

    /* 첫번째 풀이: For - Loop 돌려보기 */
    private static String testLoopingByNum01() {
        sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int k = sc.nextInt();

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }
        return answer.toString();
    }

    /* 첫번째 풀이: IntStream.of 사용 해보기 */
    private static String testLoopingByNum02() {
        sc = new Scanner(System.in);
        String my_string = sc.nextLine();
        int k = sc.nextInt();

        String answer = IntStream.of(0, k)// 0 - k(3)까지 정수 범위 생성
                .mapToObj(i -> my_string) // i -> my_string 문자열로 매핑 ----> 0:string, 1:string, 2:string
                .collect(Collectors.joining());
        return answer;
    }
}
