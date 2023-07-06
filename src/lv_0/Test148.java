package lv_0;

import java.util.Arrays;
import java.util.Stack;

/**
 * 배열 만들기 6
 * 문제 설명
 * 0과 1로만 이루어진 정수 배열 arr가 주어집니다. arr를 이용해 새로운 배열 stk을 만드려고 합니다.
 * i의 초기값을 0으로 설정하고 i가 arr의 길이보다 작으면 다음을 반복합니다.
 * 만약 stk이 빈 배열이라면 arr[i]를 stk에 추가하고 i에 1을 더합니다.
 * stk에 원소가 있고, stk의 마지막 원소가 arr[i]와 같으면 stk의 마지막 원소를 stk에서 제거하고 i에 1을 더합니다.
 * stk에 원소가 있는데 stk의 마지막 원소가 arr[i]와 다르면 stk의 맨 마지막에 arr[i]를 추가하고 i에 1을 더합니다.
 * 위 작업을 마친 후 만들어진 stk을 return 하는 solution 함수를 완성해 주세요.
 * 단, 만약 빈 배열을 return 해야한다면 [-1]을 return 합니다.
 *
 * 제한사항
 * 1 ≤ arr의 길이 ≤ 1,000,000
 * arr의 원소는 0 또는 1 입니다.
 *
 * 입출력 예
 * arr	result
 * [0, 1, 1, 1, 0]	[0, 1, 0]
 */
public class Test148 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 1, 0};
        int[] solution = new Solution().solution(arr);
        System.out.println("solution = " + Arrays.toString(solution));
    }

    static class Solution {
        public int[] solution(int[] arr) {
            int[] answer = {};
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < arr.length; i++) {
                if (stack.isEmpty()) {
                    stack.add(arr[i]);
                } else if (stack.peek() == arr[i]) {
                    stack.pop();
                } else {
                    stack.push(arr[i]);
                }
            }

            if (stack.isEmpty()) {
                stack.push(-1);
            }

            answer = Arrays.stream(stack.toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();

            return answer;
        }
    }

    /*
    class Solution {
        public int[] solution(int[] arr) {

            Stack<Integer> stack = new Stack<>();

            for (int no : arr) {
                if (!stack.isEmpty() && no == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(no);
                }
            }

            return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
        }
    }
     */
}

