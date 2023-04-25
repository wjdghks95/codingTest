package lv_0;

/**
 * 원하는 문자열 찾기
 * 문제 설명
 * 알파벳으로 이루어진 문자열 myString과 pat이 주어집니다.
 * myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.
 * 단, 알파벳 대문자와 소문자는 구분하지 않습니다.
 *
 * 제한사항
 * 1 ≤ myString의 길이 ≤ 100,000
 * 1 ≤ pat의 길이 ≤ 30
 * myString과 pat은 모두 알파벳으로 이루어진 문자열입니다.
 */
public class NTest28 {
	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		//return 1
		int solution = new Solution().solution(myString, pat);
		System.out.println("solution = " + solution);
	}

	static class Solution {
		public int solution(String myString, String pat) {
			int answer = 0;
			answer = myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
			return answer;
		}
	}
}
