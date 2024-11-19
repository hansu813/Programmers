package programers.level_0;

/**
 * packageName    : programers.level_0
 * fileName       : Solution181832
 * author         : Hansu
 * date           : 2024-11-15
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-15        shn81       최초 생성
 */
public class Solution181832 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int value = 1;
        int x = 0, y = 0;
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        int direction = 0;

        while (value <= n * n) {
            answer[x][y] = value++;

            int nx = x + dx[direction];
            int ny = y + dy[direction];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || answer[nx][ny] != 0) {
                direction = (direction + 1) % 4;
                nx = x + dx[direction];
                ny = y + dy[direction];
            }
            x = nx;
            y = ny;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[][] test = solution(4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(test[i][j] + " ");
            }
            System.out.println();
        }
    }
}
