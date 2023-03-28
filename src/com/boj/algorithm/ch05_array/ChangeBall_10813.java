package com.boj.algorithm.ch05_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author : ymkim
 * @since 20230328
 *
 * [문제 번호]
 *
 * 10813
 *
 * [문제]
 * 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
 * 바구니에는 공이 1개씩 들어있고, 처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다.
 *
 * 도현이는 앞으로 M번 공을 바꾸려고 한다. 도현이는 공을 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
 * 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에 N (1 ≤ N ≤ 100)과 M (1 ≤ M ≤ 100)이 주어진다.
 *
 * 둘째 줄부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻이다. (1 ≤ i ≤ j ≤ N)
 *
 * 도현이는 입력으로 주어진 순서대로 공을 교환한다.
 *
 * [출력]
 * 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
 */
public class ChangeBall_10813 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int [] bucket = new int[N];  // 바구니 갯수 지정 -> N : 5 -> 5개의 배열 저장 공간

        // 도현이는 바구니를 총 N개 가지고 있고, 각각의 바구니에는 1번부터 N번까지 번호가 매겨져 있다.
        // 바구니에는 공이 1개씩 들어있고 "처음에는 바구니에 적혀있는 번호와 같은 번호가 적힌 공이 들어있다"
        for (int i = 0; i < N; i++) { // 1:1, 2:2, 3:3
            bucket[i] = i + 1;
        }

        int M = Integer.parseInt(st.nextToken()); // 공을 바꾸는 횟수를 몇번 수행할 것인지 지정

        // 선택 정렬 할때와 유사한 코드임
        // int temp;
        // temp = x[I - 1];
        // x[I - 1] = y[J - 1]
        // y[J - 1] = temp;
        for (int i = 0; i < M; i++) {
            int temp;
            st = new StringTokenizer(br.readLine(), " ");
            int F = Integer.parseInt(st.nextToken()); // I번 바구니
            int E = Integer.parseInt(st.nextToken()); // J번 바구니

            temp = bucket[F - 1];
            bucket[F - 1] = bucket[E - 1];
            bucket[E - 1] = temp;
        }
        br.close();
        for (int res : bucket) {
            System.out.println(res);
        }
    }

    /*private static int swap(int [] arr, int minIdx, int standardIdx) {
        int temp = arr[minIdx]; // 최소값 저장

        arr[minIdx] = arr[standardIdx]; // 최소값 = 가장 앞 자리의 수를 swap 한다
        arr[standardIdx] = temp; // 가장 앞자리의 수에는 = 최소값은 셋팅한다.
        return temp;
    }*/
}
