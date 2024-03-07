package Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : Solution
 * fileName       : Solution42748
 * author         : Hansu
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07        shn81       최초 생성
 */
public class Solution42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int n = 0; n < commands.length; n++) {
            int i = commands[n][0] - 1, j = commands[n][1], k = commands[n][2] - 1;
            int[] tmp = Arrays.copyOfRange(array, i, j);
            Arrays.sort(tmp);
            answer[n] = tmp[k];
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        Solution42748 s = new Solution42748();
        int[] answer = s.solution(arr, commands);

        for (int n : answer) {
            System.out.print(n + " ");
        }
    }
}
