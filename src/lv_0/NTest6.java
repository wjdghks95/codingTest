package lv_0;

/**
 * n의 배수
 * 문제 설명
 * 정수 num과 n이 매개 변수로 주어질 때, num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 2 ≤ num ≤ 100
 * 2 ≤ n ≤ 9
 */
public class NTest6 {
	public static void main(String[] args) {
		int num = 98;
		int n = 2;
		int solution = new Solution().solution(num, n);
		System.out.println("solution = " + solution);
	}

	static class Solution {
		public int solution(int num, int n) {
			int answer = 0;
			if (num % n == 0) {
				answer = 1;
			} else {
				answer = 0;
			}
			return answer;
		}
	}
}
