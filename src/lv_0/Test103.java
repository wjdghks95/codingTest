package lv_0;

import java.util.Arrays;

/**
 * 문자열 잘라서 정렬하기
 * 문제 설명
 * 문자열 myString이 주어집니다. "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.
 * 단, 빈 문자열은 반환할 배열에 넣지 않습니다.
 *
 * 제한사항
 * 1 ≤ myString ≤ 100,000
 * myString은 알파벳 소문자로 이루어진 문자열입니다.
 * 입출력 예
 * myString	result
 * "axbxcxdx"	["a","b","c","d"]
 * "dxccxbbbxaaaa"	["aaaa","bbb","cc","d"]
 */
public class Test103 {
    public static void main(String[] args) {
        String myString = "axbxcxd";
        // result ["a","b","c","d"]
        String[] solution = new Solution().solution(myString);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public String[] solution(String myString) {
            String[] answer = {};
            answer = Arrays.stream(myString.split("x+")).filter(s -> !s.equals("")).sorted().toArray(String[]::new);
            return answer;
        }
    }
}

