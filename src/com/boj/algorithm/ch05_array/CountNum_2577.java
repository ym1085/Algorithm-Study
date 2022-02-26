package com.boj.algorithm.ch05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220226
 *
 * [문제 번호]
 *
 * 2577
 *
 * [문제]
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에
 * 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 * [입력]
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다.
 * A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 *
 * [출력]
 * 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
 *
 * 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가
 * 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
 */
public class CountNum_2577 {
    /**
     [오답 풀이]

     ❌ 문제 풀이 과정에서 잘못된 방향성으로 문제 풀이 진행

        1. 이상한 방법을 계속해서 시도 하였음

     🍃 charAt를 통해 문제풀이 진행

        1. 우선 세 개의 값을 곱한 숫자를 입력 받은 후에, 해당 값을 문자열로 변환한다.
        2. 반복문 사용, charAt(j)를 통해 '문자' 한개를 받고 후에 해당 문자 - '0' (ASCII 48)을 빼준다.
        3. ex ==> ( 문자열 : 1(49) - 문자열 : 0(48) = 1) == i
        4. 같을 경우 cnt 변수 증감

     💡 etc

        1. https://park-duck.tistory.com/114
        2. https://ponyozzang.tistory.com/392
     */
    public static void main(String[] args) throws IOException {
        /*
            desc    : 숫자의 개수 구하기
            memory  : 17668KB
            time    : 212ms
        */
        Scanner sc = new Scanner(System.in);
        int N = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        String str = String.valueOf(N);

        for (int i = 0; i < 10; i++) {
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0') == i) { // i = n === (1, 7, 0, 3, 7, 3, 0, 0)
                    cnt++;
                }
//                System.out.println("str.charAt(j) ==> " + (str.charAt(j) - '0'));
            }
//            System.out.println(i + " : " + cnt); // idx 매칭 보려면, 해당 주석 해제
            System.out.println(cnt);
        }

        /*
            desc    : 숫자의 개수 구하기
            memory  : 14188KB
            time    : 120ms
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()); // 17037300

        int [] arr = new int[10];
        while(value != 0) {
            int idx = value % 10;
            System.out.println("idx => " + idx);
            arr[idx]++;
            value /= 10;
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}
