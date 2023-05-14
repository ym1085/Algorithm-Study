package com.programmers.algorithm.lv00;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author ymkim
 * @since 2023-05-14
 * @desc : 문자 리스트를 문자열로 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941?language=java
 */
public class _181941 {
    private static final String [] arr = {"a", "b", "c"};

    /**
     * 핵심은 String [] 배열을 문자열로 결합하여 변환하는 것
     */
    public static void main(String[] args) {
        String answer = "";
        answer = convertStrToList01();
        System.out.println(answer);

        answer = convertStrToList02();
        System.out.println(answer);

        answer = convertStrToList03();
        System.out.println(answer);
    }

    /* 첫번째 풀이: Arrays.stream() 사용 하기 */
    private static String convertStrToList01() {
        return Arrays.stream(arr)
                .collect(Collectors.joining("")) // 하나의 문자열로 결합하는 역할, delimiter => 어떤 구분자로 문자열을 붙힐 것인가?
                .trim();
    }

    /* 두번째 풀이: For - Loop // StringBuilder 사용 */
    private static String convertStrToList02() {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            answer.append(arr[i]);
        }
        return answer.toString();
    }

    /* 세번째 풀이: String Class 사용 */
    private static String convertStrToList03() {
        return String.join("", arr);
    }
}
