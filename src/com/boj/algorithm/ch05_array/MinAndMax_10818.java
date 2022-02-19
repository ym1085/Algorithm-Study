package com.boj.algorithm.ch05_array;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220219
 *
 * [문제 번호]
 *
 * 10818
 *
 * [문제]
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 *
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * [출력]
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 */
public class MinAndMax_10818 {

    public static void main(String[] args) {
        /*
            desc    : 배열의 최소값, 최대값 구하기
            memory  : 318860KB
            time    : 1788ms
        */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int [] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
