package programers.level_0;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120876
 * author         : Hansu
 * date           : 2024-11-22
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-22        shn81       최초 생성
 */
public class Solution120876 {
    static int solution(int[][] lines) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = lines[i][0]; j < lines[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int answer = 0;
        for (int key : map.keySet()) {
            answer += map.get(key) > 1 ? 1 : 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{0, 1}, {2, 5}, {3, 9}}));

    }
}
