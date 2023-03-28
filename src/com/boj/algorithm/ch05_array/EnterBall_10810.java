package com.boj.algorithm.ch05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author : ymkim
 * @since 20230327
 *
 * [문제 번호]
 *
 * 10810
 *
 * [문제]
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
 * 또, 1번부터 N번까지 번호가 적혀있는 공을 매우 많이 가지고 있다.
 * 가장 처음 바구니에는 공이 들어있지 않으며, 바구니에는 공을 1개만 넣을 수 있다.
 *
 * 도현이는 앞으로 M번 공을 넣으려고 한다. 도현이는 한 번 공을 넣을 때, 공을 넣을 바구니 범위를 정하고,
 * 정한 바구니에 모두 같은 번호가 적혀있는 공을 넣는다.
 * 만약, 바구니에 공이 이미 있는 경우에는 들어있는 공을 빼고, 새로 공을 넣는다.
 * 공을 넣을 바구니는 연속되어 있어야 한다.
 *
 * 공을 어떻게 넣을지가 주어졌을 때, M번 공을 넣은 이후에 각 바구니에 어떤 공이 들어 있는지 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 *
 * 둘째 줄부터 M개의 줄에 걸쳐서 공을 넣는 방법이 주어진다. 각 방법은 세 정수 i j k로 이루어져 있으며, i번 바구니부터 j번 바구니까지에 k번 번호가 적혀져 있는 공을 넣는다는 뜻이다. 예를 들어, 2 5 6은 2번 바구니부터 5번 바구니까지에 6번 공을 넣는다는 뜻이다. (1 ≤ i ≤ j ≤ N, 1 ≤ k ≤ N)
 *
 * 도현이는 입력으로 주어진 순서대로 공을 넣는다.
 *
 * [출력]
 * 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다. 공이 들어있지 않은 바구니는 0을 출력한다.
 */
public class EnterBall_10810 {

    /**
     * 내가 풀이한 문제
     * 1. 문제를 정확히 파악하지 못했음
     * @param args
     */
    /*public static void main(String[] args) {
        // 5, 4 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 공간 갯수 지정
        int M = sc.nextInt(); // 몇번 바구니에 공을 넣을지 지정
        String [] bucket = new String[N]; // 'N'개의 바구니 공간 생성
        sc.nextLine();

        for (int i = 0; i < M; i++) { // M 번 돌린다
            String [] condition = sc.nextLine().split(" ");
            System.out.println("condition => " + Arrays.toString(condition));
            System.out.println("condition.length => " + condition.length);
            for (int j = 0; j < condition.length -1; j++) { // 배열의 공간 갯수 만큼 돌린다
                System.out.println("j => " + j);
                bucket[Integer.parseInt(condition[j]) - 1] = condition[condition.length - 1];
                System.out.println("Arrays.toString(bucket) => " + Arrays.toString(bucket));
            }
        }
        System.out.println(Arrays.toString(bucket));
    }*/

    /**
     * 다른 사람의 풀이 : EXAMPLE 01
     * 1. https://build-enough.tistory.com/116
     * 2. F 범위에서 ~ K 범위에 데이터를 저장할때 두개의 범위를 받고 Loop 돌리는 것이 핵심인 듯
     * 3. 배열의 인덱스는 0부터 시작, n - 1
     * @param args
     */
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 바구니 공간(배열 저장 공간 N개)
        int [] arr = new int[N];

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            int I = sc.nextInt(); // 바구니의 처음 'I' 부터
            int J = sc.nextInt(); // 바구니의 끝 'J' 까지 저장
            int B = sc.nextInt(); // B(ball)을 I ~ J 인덱스에 저장

            for (int j = I - 1; j < J; j++) { // I - 1 => 0, 1 ///// J => 2
                arr[j] = B;
            }
        }
        System.out.println(Arrays.toString(arr));
    }*/

    /**
     * 다른 사람의 풀이 : EXAMPLE 02
     * 1. https://koohee.tistory.com/14
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // BufferedReader는 Buffer를 이용하는 함수
        // Scanner는 스페이스 + 엔터를 경계로 입력값을 인식
        // BufferedReader는 엔터만 경계로 인식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // StringTokenizer는 특정 기호를 기반으로 구분자(" ") + Token(문자열)로 구분해주는 API
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];

        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = I - 1; j < J; j++) {
                arr[j] = B;
            }
        }
        br.close();
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
