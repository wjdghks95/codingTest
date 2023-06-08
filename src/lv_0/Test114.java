package lv_0;

/**
 * 이차원 배열 대각선 순회하기
 *
 * 문제 설명
 * 2차원 정수 배열 board와 정수 k가 주어집니다.
 * i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 1 ≤ board의 길이 ≤ 100
 * 1 ≤ board[i]의 길이 ≤ 100
 * 1 ≤ board[i][j] ≤ 10,000
 * 모든 board[i]의 길이는 같습니다.
 * 0 ≤ k < board의 길이 + board[i]의 길이
 *
 * 입출력 예
 * board	k	result
 * [[0, 1, 2],[1, 2, 3],[2, 3, 4],[3, 4, 5]]	2	8
 *
 * 입출력 예 #1의 board를 표로 나타내면 다음과 같습니다.
 * i \ j	0	1	2
 * 0	    0	1	2
 * 1	    1	2	3
 * 2	    2	3	4
 * 3	    3	4	5
 * i + j가 2보다 작거나 같은 항들의 합은 0 + 1 + 2 + 1 + 2 + 2 = 8이므로 8을 return 합니다.
 */
public class Test114 {
    public static void main(String[] args) {
        int board[][] = {{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int k = 2;
        // result 8
        int solution = new Solution().solution(board, k);
        System.out.println("solution = " + solution);
    }

    static class Solution {
        public int solution(int[][] board, int k) {
            int answer = 0;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (i + j <= k) {
                        answer += board[i][j];
                    }
                }
            }
            return answer;
        }
    }

    /*
    class Solution {
        public static int solution(int[][] board, int k) {
            return IntStream.range(0, board.length).filter(i -> i <= k).map(
                i -> IntStream.range(0, board[i].length).filter(j -> j <= k - i).map(j -> board[i][j]).sum()).sum();
        }
    }
     */
}

