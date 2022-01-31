package com.boj.algorithm.ch02_if;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220127
 *
 * [문제 번호]
 *
 * 14681
 *
 * [문제]
 * 흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
 * 사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제n사분면"이라는 뜻이다.
 *
 * [입력]
 * 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
 *
 * [출력]
 * 점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
 */
public class Quadrant_14681 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) { // A
            System.out.println(1);
        } else if (x < 0 && y > 0) { // B
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}
