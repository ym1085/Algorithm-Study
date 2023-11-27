package com.programmers.algorithm.lv00;

import java.util.Scanner;

/**
 * @author ymkim
 * @since 2023-11-27
 * @desc : 주사위 게임 2
 * https://school.programmers.co.kr/learn/courses/30/lessons/181930
 *
 * [문제 번호]
 * 181930
 *
 * [문제]
 *
 * 1부터 6까지 숫자가 적힌 주사위가 세 개 있습니다. 세 주사위를 굴렸을 때 나온 숫자를 각각 a, b, c라고 했을 때 얻는 점수는 다음과 같습니다.
 *
 * 세 숫자가 모두 다르다면 a + b + c 점을 얻습니다.
 * 세 숫자 중 어느 두 숫자는 같고 나머지 다른 숫자는 다르다면 (a + b + c) × (a2 + b2 + c2 )점을 얻습니다.
 * 세 숫자가 모두 같다면 (a + b + c) × (a2 + b2 + c2 ) × (a3 + b3 + c3 )점을 얻습니다.
 * 세 정수 a, b, c가 매개변수로 주어질 때, 얻는 점수를 return 하는 solution 함수를 작성해 주세요.
 *
 */
public class _181930 {

    public static void main(String[] args) {
        //solution01();
        solution02();
    }

    private static void solution02() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int answer = 1;

        int count = 1;
        if (a == b || a == c || b == c) { // 최소 두 숫자가 같은 경우 확인 --> (a + b + c) * (a2 + b2 + c2)
            count++; // count ---> 2
        }

        if (a == b && b == c) { // a, b, c가 모두 같은 경우 확인 --> (a + b + c) × (a2 + b2 + c2) × (a3 + b3 + c3)
            count++; // count ---> 3
        }

        for (int i = 1; i <= count; i++) { // coutn --> 2 =======> 1, 2
            answer *= ( pow(a, i) + pow(b, i) + pow(c, i) );
        }

        System.out.println(answer);
    }

    // A 번째 (5, 1), (3, 1), (3, 1)
    // B 번째 (5, 2), (3, 2), (3, 2)
    private static int pow(int a, int b) {
        if (b == 0) return 1; // 재귀 종료 조건
        return a * pow(a, b - 1); // (a: 5, b:2 - 1)
    }

    private static void solution01() {
        // 1 - 6 까지 적힌 주사위 3개 있음
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;
        if ((a >= 1 && a <= 6) && (b >= 1 && b <= 6) && (c >= 1 && c <= 6)) {
            if (a != b && a != c && b != c) { // 세 숫자가 다르다면
                sum = a + b + c;
            } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                sum = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
            } else if (a == b && a == c && b == c) {
                sum = (int) ((a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)) * (Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
            }
        }
        System.out.println(sum);
    }
}
