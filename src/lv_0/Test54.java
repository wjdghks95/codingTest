package lv_0;

/**
 * 최대값 만들기(2)
 */
public class Test54 {
    public static void main(String[] args) {
        int[] numbers = {1, -2};
        int solution = new Solution().solution(numbers);
        System.out.println("solution = " + solution);
    }
}

class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MAX_VALUE * -1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i] * numbers[j];
                if (temp > answer) {
                    answer = temp;
                }
            }
        }
        return answer;
    }
}

/**
 * 모법답안
 */
/*
class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}
*/