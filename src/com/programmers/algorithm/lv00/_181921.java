package com.programmers.algorithm.lv00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author ymkim
 * @since 2024-01-25(목)
 * @desc : 배열 만들기 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181921
 *
 * [문제 번호]
 * 181921
 *
 * [문제]
 * 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진
 * 모든 정수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 *
 * 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.
 */
public class _181921 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution01()));
        System.out.println(Arrays.toString(solution02()));
    }

    /**
     * 1번째 문제풀이 -> 시간이 경과해서 GPT 힌트 받음
     * @return
     */
    private static int[] solution01() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        List<Integer> result = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            if (str.matches("[05]+")) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    /**
     * 2번째 문제풀이 -> 다른 사람 풀이 참조
     * @return
     */
    private static int[] solution02() {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        // IntStream.rangeClosed를 사용하여 l부터 r까지의 정수 스트림을 생성
        // rangeClosed는 A -> B(포함) 범위의 스트림을 생성
        List<Integer> filtered = IntStream.rangeClosed(l, r)
                // filter 메소드를 사용하여 조건에 맞는 숫자만 남김
                .filter(num ->
                        // 각 숫자를 문자열로 변환하고, 그 문자들이 모두 '0' 혹은 '5'인지 확인
                        String.valueOf(num).chars().allMatch(ch -> ch == '0' || ch == '5')
                )
                // 박싱하여 Integer 객체로 변환
                .boxed()
                // 결과를 리스트로 수집
                .collect(Collectors.toList());

        // 결과 리스트가 비어있는지 확인하고, 비어있으면 {-1}을 반환, 그렇지 않으면 배열로 변환하여 반환
        return filtered.isEmpty() ? new int[] { -1 } : filtered.stream().mapToInt(Integer::intValue).toArray();
    }
}

