package com.boj.algorithm.ch03_for;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author : ymkim
 * @since 20220131
 *
 * [문제 번호]
 *
 * 15552
 *
 * [문제]
 * 본격적으로 for문 문제를 풀기 전에 주의해야 할 점이 있다. 입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간초과가 날 수 있다는 점이다.
 *
 * C++을 사용하고 있고 cin/cout을 사용하고자 한다면, cin.tie(NULL)과 sync_with_stdio(false)를 둘 다 적용해 주고, endl 대신 개행문자(\n)를 쓰자.
 * 단, 이렇게 하면 더 이상 scanf/printf/puts/getchar/putchar 등 C의 입출력 방식을 사용하면 안 된다.
 *
 * Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 * BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 *
 * Python을 사용하고 있다면, input 대신 sys.stdin.readline을 사용할 수 있다.
 * 단, 이때는 맨 끝의 개행문자까지 같이 입력받기 때문에 문자열을 저장하고 싶을 경우 .rstrip()을 추가로 해 주는 것이 좋다.
 *
 * 또한 입력과 출력 스트림은 별개이므로, 테스트케이스를 전부 입력받아서 저장한 뒤 전부 출력할 필요는 없다.
 * 테스트케이스를 하나 받은 뒤 하나 출력해도 된다.
 *
 * [입력]
 * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
 *
 * [출력]
 * 각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
 */
public class QuickSum_15552 {

    /**
     [풀이]

     ❌ indexOutOfBounds 에러가 계속 발생해서 정해진 시간을 초과함

     🔨 System.out.println, Scanner에 비해 속도 및 성능이 좋은 BufferedReader, Writer를
     사용하여 문제 풀이를 하였는데, TODO 세번째 풀이에 Java 스트림 예제를 추가하면 좋을 것 같다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine()); // ex) counting : 5, 3..
        System.out.println("length = " + length);

        //[0] 첫번째 풀이
        /*for (int i = 0; i < length; i++) {
            String str = br.readLine();
            int a = Integer.parseInt(str.split(" ")[0]);
            int b = Integer.parseInt(str.split(" ")[1]);
            bw.write((a + b) + "\n");
        }*/

        //[1] 두번째 풀이
        for (int i = 0; i < length; i++) {
            String [] str = br.readLine().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            bw.write((a + b) + "\n");
        }

        //[2] 세번째 풀이: 스트림
        bw.flush();
    }
}
