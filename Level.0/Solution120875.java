package programers.level_0;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120875
 * author         : Hansu
 * date           : 2024-11-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-22        shn81       최초 생성
 */
public class Solution120875 {
    static int solution(int[][] dots) {
        int x1 = dots[0][0], x2 = dots[1][0], x3 = dots[2][0], x4 = dots[3][0];
        int y1 = dots[0][1], y2 = dots[1][1], y3 = dots[2][1], y4 = dots[3][1];

        double a = (double) (y2 - y1) / (x2 - x1);
        double b = (double) (y4 - y3) / (x4 - x3);
        if (a == b) return 1;

        a = (double) (y3 - y1) / (x3 - x1);
        b = (double) (y2 - y4) / (x2 - x4);
        if (a == b) return 1;

        a = (double) (y4 - y1) / (x4 - x1);
        b = (double) (y2 - y3) / (x2 - x3);
        if (a == b) return 1;

        return 0;
    }

    public static void main(String[] args) {

    }
}
