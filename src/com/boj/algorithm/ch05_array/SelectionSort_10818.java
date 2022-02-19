package com.boj.algorithm.ch05_array;

import java.util.Scanner;

public class SelectionSort_10818 {

    public static void main(String[] args) {
        /*
            desc    : 선택 정렬 알고리즘을 통해 문제풀이, 해당 문제는 다른 방식으로 풀어볼려고 만든 예제
            memory  : 0KB
            time    : 시간초과
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("최소값, 최대값을 구하고 싶은 배열의 크기를 입력하세요 : ");
        int length = sc.nextInt();
        System.out.println("입력값 : " + length + "\n");

        int [] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1; // 1 ~ 100
        }
        chooseAndSortArray(arr, arr.length);
    }

    public static void chooseAndSortArray(int [] arr, int size) {
        /*System.out.println("============================================================================================");
        System.out.println("selection_sort :: arr = " + Arrays.toString(arr) + ", size = " + size);
        System.out.println("============================================================================================\n");*/

        // logging 용
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        int [] swapArray = new int[size];
        int standardIdx = 0;
        for (; standardIdx < size; standardIdx++) {
            // System.out.println("size = " + (size - 1)); // 4, 4, 4, 4, 💣 break(5)
            int minIdx = standardIdx; // 기준이 되는 인덱스 최초로 한번 저장

            int j = standardIdx + 1;
            for (; j < size; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j; // 최소값이 저장된 위치(array index)
                }
            }
            swapArray[standardIdx] = swap(arr, minIdx, standardIdx);
        }
        // System.out.println("swapArray => " + Arrays.toString(swapArray));
        // System.out.println(Arrays.toString(swapArray)); // 그냥 통으로 뽑으려면 해당 주석 해제
        System.out.println("⚡ min = " + swapArray[0]);
        System.out.println("⚡ max = " + swapArray[size - 1]);
    }

    /**
     *  파라미터 해석
     *
     *  param: 원본 배열, minIdx: 최소값이 저장된 위치의 인덱스, standardIdx: 현재 가장 앞자리의 인덱스
     *
     * @param arr
     * @param minIdx
     * @param standardIdx
     * @return temp -> int : min
     */
    private static int swap(int [] arr, int minIdx, int standardIdx) {
        int temp = arr[minIdx]; // 최소값 저장

        arr[minIdx] = arr[standardIdx]; // 최소값 = 가장 앞 자리의 수를 swap 한다
        arr[standardIdx] = temp; // 가장 앞자리의 수에는 = 최소값은 셋팅한다.
        return temp;
    }
}
