package programers.level_0;

import java.util.Stack;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120907
 * author         : Hansu
 * date           : 2024-11-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-17        shn81       최초 생성
 */
public class Solution120907 {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int left = arr[1].equals("+") ? Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]) : Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
            answer[i] = left == Integer.parseInt(arr[4]) ? "O" : "X";
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] str1 = {"3 - 4 = -3", "5 + 6 = 11"};
        solution(str1);

        String[] str2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        solution(str2);
    }
}
