package programers.level_0;

import java.util.*;

/**
 * packageName    : programers.level_0
 * fileName       : Solution181851
 * author         : Hansu
 * date           : 2024-11-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-14        shn81       최초 생성
 */
public class Solution181851 {
    // 전국 대회 선발 고사
    public static int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                map.put(rank[i], i);
            }
        }
        int idx = 0, a = 0, b = 0, c = 0;
        for (int i : map.values()) {
            if (idx == 0) {
                a = i;
            } else if (idx == 1) {
                b = i;
            } else if (idx == 2) {
                c = i;
            } else {
                break;
            }
            idx++;
        }
        return 10000 * a + 100 * b + c;
    }


    public static void main(String[] args) {

    }
}
