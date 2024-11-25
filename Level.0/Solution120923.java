package programers.level_0;

import java.util.Arrays;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120923
 * author         : Hansu
 * date           : 2024-11-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-25        shn81       최초 생성
 */
public class Solution120923 {
    static int[] solution(int num, int total) {
        int[] answer = new int[num];
        int target = (total / num) - (num - 1) / 2;

        for (int i = 0; i < num; i++) {
            answer[i] = target++;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
