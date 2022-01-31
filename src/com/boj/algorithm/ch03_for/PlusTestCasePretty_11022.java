package com.boj.algorithm.ch03_for;

import java.io.*;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 11022
 *
 * [문제]
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * [출력]
 * 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
 */
public class PlusTestCasePretty_11022 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for ( int i = 1; i <= t; i++ ) {
            String [] str = br.readLine().split(" ");
            int n1 = Integer.parseInt(str[0]);
            int n2 = Integer.parseInt(str[1]);
            bw.write("Case #" + i + ": " + n1 + " + " + n2 + " = " + (n1 + n2) + "\n");
        }
        bw.flush();
    }
}
