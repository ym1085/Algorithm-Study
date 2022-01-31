package com.boj.algorithm.ch03_for;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 2439
 *
 * [문제]
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * [입력]
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * [출력]
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
public class PrintReverseStar_2439 {

    /**
     [풀이]

     🔨 우선 별을 5개까지 찍기 위해서 첫번째 for문을 5번으로 고정 시킨다.
     후에 내부적으로 2개의 for문을 가지게 되는데, 첫 번째 for문의 경우 공백을 출력 하는데
     length 길이보다 작을때까지만 출력을 한다.

     ( length - i ) 을 해서 첫 번째 라인은 5개의 공백, 두 번째 라인은 4개의 공백... 순으로
     공백을 출력하기 위해 위 수식을 사용한다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        for ( int i = 1; i <= length; i++ ) {
//          i : 1, 2, 3, 4, 5

            for ( int j = 1; j <= length - i; j++ ) { // 1, 2, 3, 4
                System.out.print(" ");
            }

            for (int x = 1; x <= i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
