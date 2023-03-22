package com.boj.algorithm.ch05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20230322
 *
 * [문제 번호]
 *
 * 10807
 *
 * [문제]
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다.
 * 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 *
 * [출력]
 * 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.
 */
public class CountNumArr_10807 {

    public static void main(String[] args) throws IOException {
        /**
         * 나의 문제 풀이
         * - 정답 여부 : o
         * - 보완 부분 : 답은 맞았지만 문제가 의도한 부분과 다른 풀이 방식을 사용
         */
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] A = sc.nextLine().split(" ");
        String B = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i].equalsIgnoreCase(B)) {
                sum+=1;
            }
        }
        System.out.println(sum);
        System.out.println();

        /**
         * 다른 사람의 문제 풀이
         * - 정답 여부 : o
         * - 보완 부분 : N을 배열의 공간 값으로 지정, Loop 사용하여 배열 초기화 및 IF 비교
         */
        Scanner sc2 = new Scanner(System.in);
        int N2 = sc2.nextInt(); // N2 개수만큼 정수를 뽑은 후에 해당 정수 범위 내에서 특정 숫자가 몇개인지 체크
        int[] arr = new int[N2]; // N2 개수만큼 정수를 저장
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) { // 배열의 크기만큼 Loop 실행
            arr[i] = sc2.nextInt(); // buffer에서 한 글자씩 빼서 저장
        }
        int v = sc2.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
