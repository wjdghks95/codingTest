package lv_0;

/**
 * 다항식 더하기
 * 문제 설명
 * 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
 * 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
 * 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
 * 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요. 같은 식이라면 가장 짧은 수식을 return 합니다.
 *
 * 제한사항
 * 0 < polynomial에 있는 수 < 100
 * polynomial에 변수는 'x'만 존재합니다.
 * polynomial은 양의 정수, 공백, ‘x’, ‘+'로 이루어져 있습니다.
 * 항과 연산기호 사이에는 항상 공백이 존재합니다.
 * 공백은 연속되지 않으며 시작이나 끝에는 공백이 없습니다.
 * 하나의 항에서 변수가 숫자 앞에 오는 경우는 없습니다.
 * " + 3xx + + x7 + "와 같은 잘못된 입력은 주어지지 않습니다.
 * 0으로 시작하는 수는 없습니다.
 * 문자와 숫자 사이의 곱하기는 생략합니다.
 * polynomial에는 일차 항과 상수항만 존재합니다.
 * 계수 1은 생략합니다.
 * 결괏값에 상수항은 마지막에 둡니다.
 * 0 < polynomial의 길이 < 50
 *
 * 입출력 예
 * polynomial	result
 * "3x + 7 + x"	"4x + 7"
 * "x + x + x"	"3x"
 */
public class Test159 {
    public static void main(String[] args) {
        String polynomial = "1";
        String solution = new Solution().solution(polynomial);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public String solution(String polynomial) {
            String answer = "";

            int xNum = 0;
            int num = 0;

            String[] split = polynomial.split("[+]");
            for (String s : split) {
                String str = s.trim();
                if (str.contains("x")) {
                    String x = str.substring(0, str.indexOf("x"));
                    xNum += x.equals("") ? 1 : Integer.parseInt(x);
                } else {
                    num += Integer.parseInt(str);
                }
            }

            if (xNum != 0) {
                if (xNum == 1) {
                    answer += "x";
                } else {
                    answer += xNum + "x";
                }

                if (num != 0) {
                    answer += " + " + num;
                }
            } else {
                answer += num;
            }

            return answer;
        }
    }
}