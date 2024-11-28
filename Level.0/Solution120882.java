package programers.level_0;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120882
 * author         : Hansu
 * date           : 2024-11-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-28        shn81       최초 생성
 */
public class Solution120882 {
    static int[] solution(int[][] score) {
        double[] avg = new double[score.length];
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            avg[i] = (double) (score[i][0] + score[i][1]) / 2;
        }

        for (int i = 0; i < avg.length; i++) {
            int rank = 1;
            for (int j = 0; j < avg.length; j++) {
                if (avg[i] < avg[j]) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
