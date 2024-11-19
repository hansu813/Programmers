package programers.level_0;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120812
 * author         : Hansu
 * date           : 2024-11-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-18        shn81       최초 생성
 */
public class Solution120812 {
    public int solution(int[] array) {
        int maxCnt = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : array) {
            int cnt = map.getOrDefault(n, 0) + 1;
            if (cnt > maxCnt) {
                maxCnt = cnt;
                answer = n;
            } else if (cnt == maxCnt) {
                answer = -1;
            }
            map.put(n, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
