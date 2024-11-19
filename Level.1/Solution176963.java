package level_1;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : level_1
 * fileName       : Solution176963
 * author         : Hansu
 * date           : 2024-11-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-19        shn81       최초 생성
 */
public class Solution176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        int idx = 0;
        for (String[] arr : photo) {
            int sum = 0;
            for (String str : arr) {
                if (map.containsKey(str)) sum += map.get(str);
            }
            answer[idx++] = sum;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
