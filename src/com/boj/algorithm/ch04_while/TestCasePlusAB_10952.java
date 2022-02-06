package com.boj.algorithm.ch04_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author : ymkim
 * @since 20220206
 *
 * [문제 번호]
 *
 * 10952
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * 입력의 마지막에는 0 두 개가 들어온다.
 *
 * [출력]
 * 각 테스트 케이스마다 A+B를 출력한다.
 */
public class TestCasePlusAB_10952 {

    public static void main(String[] args) throws IOException {

        /*
            desc    : BufferedReader, StringTokenizer
            memory  : 14268KB
            time    : 136ms
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = null;
        List<Integer> sum = new ArrayList<>();
//        int i = 0;
        while(true) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int condition = a + b;
            if ((condition) == 0) {
                break;
            } else {
//                i++;
                sum.add(a + b);
//                System.out.println("i == " + i);
            }
        }
//        System.out.println("size = " + sum.size());
        for (Integer integer : sum) {
            System.out.println(integer);
        }
    }
}
