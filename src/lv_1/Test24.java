package lv_1;

/**
 * 약수의 개수와 덧셈
 * 문제 설명
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 * 입출력 예
 * left	right	result
 * 13	17	43
 * 24	27	52
 */
public class Test24 {
	public static void main(String[] args) {
		int left = 13;
		int right = 17;
		int solution = new Solution().solution(left, right);
		System.out.println("solution = " + solution);
	}

	static class Solution {
		public int solution(int left, int right) {
			int answer = 0;

			for (int i = left; i <= right; i++) {

				int count = 1;
				for (int j = 1; j <= i / 2; j++) {
					if (i % j == 0) { count++; }
				}

				answer = count % 2 == 0 ? answer + i : answer - i;
			}

			return answer;
		}
	}
}

/*
	class Solution {
	    public int solution(int left, int right) {
	        int answer = 0;

	        for (int i=left;i<=right;i++) {
	            //제곱수인 경우 약수의 개수가 홀수
	            if (i % Math.sqrt(i) == 0) {
	                answer -= i;
	            }
	            //제곱수가 아닌 경우 약수의 개수가 짝수
	            else {
	                answer += i;
	            }
	        }

	        return answer;
	    }
	}
 */