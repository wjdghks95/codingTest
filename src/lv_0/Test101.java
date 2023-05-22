package lv_0;

/**
 * 두 수의 연산값 비교하기
 * 문제 설명
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.
 * 12 ⊕ 3 = 123
 * 3 ⊕ 12 = 312
 * 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.
 *
 * 단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
 *
 * 제한사항
 * 1 ≤ a, b < 10,000
 * 입출력 예
 * a	b	result
 * 2	91	364
 * 91	2	912
 */
public class Test101 {
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        // result 364
        int solution = new Solution().solution(a, b);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public int solution(int a, int b) {
            int answer = 0;
            answer = Integer.parseInt(String.valueOf(a) + b) >= 2 * a * b ? Integer.parseInt(String.valueOf(a) + b) : 2 * a * b;
            return answer;
        }
    }

    /*
    class Solution {
        public int solution(int a, int b) {
            return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
        }
    }
     */
}

