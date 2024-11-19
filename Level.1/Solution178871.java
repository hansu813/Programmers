package level_1;

import java.util.*;

/**
 * packageName    : level_1
 * fileName       : Solution178871
 * author         : Hansu
 * date           : 2024-11-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-18        shn81       최초 생성
 */
public class Solution178871 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String str : callings) {
            int idx = map.get(str);
            String front = players[idx - 1];

            map.put(str, map.get(str) - 1);
            map.put(front, map.get(front) + 1);

            players[idx] = front;
            players[idx - 1] = str;
        }

        return players;
    }

    public static void main(String[] args) {

    }
}
