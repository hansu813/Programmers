package programers.level_0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120896
 * author         : Hansu
 * date           : 2024-11-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-17        shn81       최초 생성
 */
public class Solution120896 {
    public String solution(String s) {
        StringBuffer answer = new StringBuffer();
        char[] arr = s.toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (Character c : arr) {
            map.put(c, map.get(c) != null ? map.get(c) + 1 : 1);
        }
        for (char c : map.keySet()) {
            answer.append(map.get(c) == 1 ? c : "");
        }
        return answer.toString();
    }
}
