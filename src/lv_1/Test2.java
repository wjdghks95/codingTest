package lv_1;

/**
 * 약수의 합
 * 문제 설명
 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 사항
 * n은 0 이상 3000이하인 정수입니다.
 *
 * 입출력 예
 * n	return
 * 12	28
 * 5	6
 */
public class Test2 {
	public static void main(String[] args) {
		int n = 12;
		int solution = new Solution().solution(n);
		System.out.println("solution = " + solution);
	}

	static class Solution {
		public int solution(int n) {
			int answer = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) answer += i;
			}
			return answer;
		}
	}
}

/*
	class SumDivisor {
	    public int sumDivisor(int num) {
	        int answer = 0;
	        for(int i =1 ; i<=num/2;i++){
	            if(num%i==0){
	                answer+=i;
                }
            }
	        return answer+num;
	    }
	}
 */
