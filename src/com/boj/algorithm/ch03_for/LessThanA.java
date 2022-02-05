package com.boj.algorithm.ch03_for;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : ymkim
 * @since 20220205
 *
 * [문제 번호]
 *
 * 10871
 *
 * [문제]
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 *
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 *
 * [출력]
 * X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
public class LessThanA {

    public static void main(String[] args) throws IOException {
        /*
            desc    : Scanner
            memory  : 31100KB
            time    : 584ms
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int j = 0; j < n; j++) {
            if (x > list.get(j)) {
                System.out.print(list.get(j) + " ");
            }
        }

        /*
            desc    : BufferedReader, BufferedWriter, StringTokenizer
            memory  : 19748KB
            time    : 360ms
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // read
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // writer
        StringTokenizer st = new StringTokenizer(br.readLine(), " "); // split token

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<Integer> tokenList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            tokenList.add(Integer.parseInt(st.nextToken()));
        }
        for (int j = 0; j < N; j++) {
            if (X > tokenList.get(j)) {
                bw.write(tokenList.get(j) + " ");
            }
            bw.flush();
        }
        bw.close();
    }
}
