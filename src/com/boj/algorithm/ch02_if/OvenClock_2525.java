package com.boj.algorithm.ch02_if;

import java.util.Scanner;

/**
 * @author : ymkim
 * @since 20230226
 *
 * [문제 번호]
 *
 * 2525
 *
 * [문제]
 * KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
 * 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
 * 그러면 '인공지능 오븐은 오븐구이가 끝나는 시간'을 '분 단위로 자동적으로 계산'한다.
 *
 * 또한, KOI 전자의 인공지능 오븐 앞면에는 '사용자에게 훈제오리구이 요리가 끝나는 시각'을 알려 주는 '디지털 시계'가 있다.
 *
 * 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 *
 * [입력]
 * 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다.
 * 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
 *
 * [출력]
 * 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다.
 * (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
 */
public class OvenClock_2525 {

    /**
     * A(시), B(분)을 하나의 분으로 변환한 뒤, C를 더하고 나온 결과 값을 다시 시와 분으로 변환하는 방법
     * https://st-lab.tistory.com/292
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // 시 + 분 => 분으로 변경
        int min = (60 * A) + B;
        System.out.println("(60 * A) + B => " + min);

        // 걸리는 시간을 더해준다
        min = min + C;
        System.out.println("min + C => " + min);

        // 다시 시, 분으로 계산
        int hour = (min / 60) % 24;
        int minute = min % 60;
        System.out.println("(min / 60) % 24 => " + hour);
        System.out.println("min % 60 => " + minute);
        System.out.println(hour + " " + minute);
    }

    // 오답 처리 필요
    /*public static void main(String[] args) {
        // 01. KOI 전자에서 훈제오리구이를 간편하게 만드는 인공지능 오븐 개발
        // 02. 적당한 양의 오리 훈제 재료 인공지능에 넣어서 사용함, 인공지능이 만들어줌
        // 03. 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산
        // 04. 인공지능 오븐 앞면에는 요리가 끝나는 시간을 알려주는 디지털 시계 존재
        // 05. 훈제오리구이를 '시작하는 시간'과 오븐구이를 하는데 '필요한 시간'이 '분 단위'로 주어졌을 때, 오븐구이가 끝나는 프로그램 작성
        // 핵심) 인공지능 오븐이 요리가 끝나는 시간을 분 단위로 자동 계산

        Scanner sc = new Scanner(System.in);

        // 시작하는 시간 을 받는다
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // 소요 시간을 입력 받는다
        int durationOfTime = sc.nextInt();

        // 00x. (1) 17 40 + (2) 80 = 19 0
        // 0 < hour < 23 && 0 < minute < 59
        if (hour > 0 && hour < 24 && minute > 0 && minute < 60) {
            int totalDurationMinute = minute + durationOfTime; // 분 + 걸리는 시간 = 80
            System.out.println("totalDurationMinute = " + totalDurationMinute);

            // 14 30, 20 = 14 50
            // 17 40, 80 = 19 0
            if (totalDurationMinute > 60) { // 80
                int addOfMinute = totalDurationMinute % 60;
                int addOfTime = totalDurationMinute / 60;
                hour = hour + addOfTime;
                if (hour > 23) {
                    hour = 0;
                }
                System.out.println(hour + " " + addOfMinute);
            } else {
                System.out.println(hour + " " + totalDurationMinute);
            }
        } else {
            System.out.println("0 < hour < 24");
            System.out.println("0 < minute < 59");
        }
    }*/
}
