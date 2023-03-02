package com.boj.algorithm.ch03_for;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20230302
 *
 * [문제 번호]
 *
 * 25304
 *
 * [문제]
 * 준원이는 저번 주에 살면서 처음으로 코스트코를 가 봤다.
 * 정말 멋졌다. 그런데, 몇 개 담지도 않았는데 수상하게 높은 금액이 나오는 것이다!
 * 준원이는 영수증을 보면서 정확하게 계산된 것이 맞는지 확인해보려 한다.
 *
 * 영수증에 적힌,
 *
 * - 구매한 각 물건의 가격과 개수
 * - 구매한 물건들의 총 금액
 * 을 보고, 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하는지 검사해보자.
 *
 * [입력]
 * 첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
 *
 * 둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
 *
 * 이후
 * N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다.
 *
 * [출력]
 * 구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes를 출력한다.
 * 일치하지 않는다면 No를 출력한다.
 */
public class Receipt_25304 {

    /**
     * 다른 사람 풀이
     * @param args
     */
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int total = 0;

        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            total += a * b;
        }
        if (total == X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }*/

    /**
     * 나의 문제 풀이
     * @param args
     */
    public static void main(String[] args) {
        // 구매한 물건의 '가격'과 '개수'
        // 구매한 물건들의 총 '금액'
        // 구매한 물건의 '가격'과 '개수'로 계산한 '총 금액'이
        // 영수증에 적힌 '총 금액'과 일치하는지 검사

        // 영수증에 적힌 총 금액 'X'가 주어진다
        Scanner sc = new Scanner(System.in);
        Long total = sc.nextLong(); // 총 금액 -> 1 < X < 1 000 000 000

        // 영수증에 적힌 구매한 물건의 종류의 수 'N'이 주어진다
        int count = sc.nextInt();
        sc.nextLine(); // Int 형 사용안하고 문자로만 처리 한번 해보자

        // N개의 줄에는 각 물건의 '가격 a'와 '개수 b'가 공백 사이에 두고 주어진다
        int sum = 0;
        for (int i = 0; i < count; i++) {
            String[] strArr = sc.nextLine().split(" ");
            sum += Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1]);
        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
