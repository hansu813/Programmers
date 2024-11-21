package level_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : level_1
 * fileName       : Solution160586
 * author         : Hansu
 * date           : 2024-11-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-21        shn81       최초 생성
 */
public class Solution160586 {
    static int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = new HashMap<>();

        for (String str : keymap) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (map.containsKey(c)) {
                    map.put(c, Math.min(map.get(c), i + 1));
                } else {
                    map.put(c, i + 1);
                }
            }
        }

        int idx = 0;
        int[] answer = new int[targets.length];

        for (String str : targets) {
            for (Character c : str.toCharArray()) {
                if (!map.containsKey(c)) {
                    answer[idx] = -1;
                    break;
                }
                answer[idx] += map.get(c);
            }
            idx++;
        }
        return answer;
    }


    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD", "AABB"};
        System.out.println(Arrays.toString(solution(keymap, targets)));

        keymap = new String[]{"AA"};
        targets = new String[]{"B"};
        System.out.println(Arrays.toString(solution(keymap, targets)));

        keymap = new String[]{"AGZ", "BSSS"};
        targets = new String[]{"ASA", "BGZ"};
        System.out.println(Arrays.toString(solution(keymap, targets)));
    }
}
