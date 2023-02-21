package com.boj.algorithm.ch01_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : ymkim
 * @since 20230221
 *
 * [문제 번호]
 *
 * 11382
 *
 * [문제]
 * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 *
 * [입력]
 * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10^12)이 공백을 사이에 두고 주어진다.
 *
 * [출력]
 * A+B+C의 값을 출력한다.
 */
public class KidJungMin_11382 {

    public static void main(String[] args) throws IOException {

        /**
         * TODO: AS-IS -> Scanner를 사용하였는데 NumberFormatException 발생
         * - https://help.acmicpc.net/judge/rte/NumberFormat
         */
        /*Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" "); // 공백 -> \s, 줄 바꿈 -> \n

        int sum = 0;
        for (String str : split) {
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);*/

        /**
         * FIXME: TO-BE -> Scanner를 사용하지 않고, BufferedReader를 사용
         * - BufferedReader // BufferedWriter
         *
         * 01. BufferedReader : Scanner와 유사
         * 02. BufferedWriter : System.out.println()과 유사
         *
         * 장점 : Scanner, System.out.println에 비해 속도 측면에서 우수하며
         * 입력된 데이터가 바로 전달되지 않고, 버퍼를 거쳐 전달된다 -> 데이터 처리 효율성을 높힘.
         * 즉, 많은 양의 데이터 처리시에 효율적임
         *
         */
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = bf.readLine().split(" ");
        Long a = Long.parseLong(strArr[0]);
        Long b = Long.parseLong(strArr[1]);
        Long c = Long.parseLong(strArr[2]);
        System.out.println(a + b + c);
    }
}
