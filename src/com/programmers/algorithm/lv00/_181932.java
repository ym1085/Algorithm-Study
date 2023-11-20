package com.programmers.algorithm.lv00;

/**
 * @author ymkim
 * @since 2023-11-20
 * @desc : 코드 처리하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932?language=java
 *
 * [문제 번호]
 * 181932
 *
 * [문제]
 * 문자열 code가 주어집니다.
 * code를 앞에서부터 읽으면서 만약 문자가 "1"이면 mode를 바꿉니다. mode에 따라 code를 읽어가면서 문자열 ret을 만들어냅니다.
 *
 * mode는 0과 1이 있으며, idx를 0 부터 code의 길이 - 1 까지 1씩 키워나가면서 code[idx]의 값에 따라 다음과 같이 행동합니다.
 *
 * mode가 0일 때
 * code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
 * code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
 *
 * mode가 1일 때
 * code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
 * code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
 *
 * 문자열 code를 통해 만들어진 문자열 ret를 return 하는 solution 함수를 완성해 주세요.
 *
 * 단, 시작할 때 mode는 0이며, return 하려는 ret가 만약 빈 문자열이라면 대신 "EMPTY"를 return 합니다.
 */
public class _181932 {

    public static void main(String[] args) {
//        System.out.println("solution => " + solution());
        System.out.println("solution => " + solutionV2());
    }

    private static StringBuilder solution() {
        // 시작할때 mode는 0이며, return 하려는 ret가 빈 문자열이면 EMPTY를 return 한다
        int mode = 0;
        StringBuilder ret = new StringBuilder();

        // 문자열 code가 주어진다
        String code = "abc1abc1abc";

        // code를 앞에서부터 읽으면서, 만약 문자가 "1" 이면 mode를 바꾼다
        // mode에 따라 code를 읽어가면서 문자열 ret을 만들어낸다
        // Todo: String 문자열 "asdasdasd33131" 을 앞에서부터 읽을때는 for - loop + charAt() 사용하여 읽어준다
        for (int idx = 0; idx < code.length(); idx++) {
            // code의 length만큼 loop 수행 -> length ----> abc1abc1abc(size : 11)
            char current = code.charAt(idx);

            // mode가 '0' 일 때
            // --> code[idx]가 '1'이 아니면 idx가 짝수일때만 ret의 맨 뒤에 code[idx]를 추가
            // --> code[idx]가 '1'인 경우 mode를 0에서 1로 변경
            if (mode == 0) {
                if (current != '1') {
                    if (idx % 2 == 0) {
                        ret.append(current);
                    }
                } else if (current == '1') {
                    mode = 1;
                }
            }
            // mode가 '1' 일 때
            // --> code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
            // --> code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
            else if (mode == 1) {
                if (current != '1') {
                    if (idx % 2 == 1) {
                        ret.append(current);
                    }
                } else if (current == '1') {
                    mode = 0;
                }
            }
        }

        // https://developer-talk.tistory.com/506
        if (ret.length() == 0) {
            ret.append("EMPTY");
        }
        return ret;
    }

    // https://school.programmers.co.kr/learn/courses/30/lessons/181932/solution_groups?language=java
    private static StringBuilder solutionV2() {
        StringBuilder answer = new StringBuilder();
        String code = "abc1abc1abc";
        int mode = 0;

        /*
            mode가 0일 때
            --> code[idx]가 "1"이면 mode를 0에서 1로 바꿉니다.
            --> code[idx]가 "1"이 아니면 idx가 짝수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.

            mode가 1일 때
            --> code[idx]가 "1"이면 mode를 1에서 0으로 바꿉니다.
            --> code[idx]가 "1"이 아니면 idx가 홀수일 때만 ret의 맨 뒤에 code[idx]를 추가합니다.
        */
        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
        }
        return new StringBuilder(answer.length() == 0 ? "EMPTY" : answer.toString());
    }
}
