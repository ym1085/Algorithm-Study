package com.boj.algorithm.ch04_while;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20220218
 *
 * [문제 번호]
 *
 * 1110
 *
 * [문제]
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 *
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 *
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 *
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 *
 * [출력]
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 */
public class PlusCycle_1110 {

    /**
     [오답 풀이]

     ❌ 연산을 통해서 풀려고 하지않고, 계속 문자열을 자르고 변환해서 문제를 해결하려고 하다보니
     풀이가 산으로 갔다. 아래 오답 풀이를 통해 복기 해보자.

     🔨 연산자 우선순위를 신경 쓰면서 문제풀이 진행.
     */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int tmp = num; // 임시 저장: 26으로 테스트
        System.out.println("====================================");
        System.out.println(">>>> STEP: 01 tmp ==> " + tmp);
        System.out.println("====================================\n");

        int cnt = 0;
        while(true) {
            // 숫자 a, b를 더한다
            // int addNum = tmp % 10 + tmp / 10; // 두 번째 + 첫 번째 정수 => ex) 26 --> 6, 2
            int addNum = (tmp / 10) + (tmp % 10); // 첫 번째 + 두 번째 정수 => ex) 26 --> 2, 6
            System.out.println("====================================");
            System.out.println(">>>> STEP: 02 addNum ==> " + addNum);
            System.out.println("====================================\n");

            tmp = ((tmp % 10) * 10) + (addNum % 10);
            System.out.println("====================================");
            System.out.println(">>>> STEP: 03 tmp ==> " + tmp);
            System.out.println("====================================\n");
            cnt++;
            if (tmp == num) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
