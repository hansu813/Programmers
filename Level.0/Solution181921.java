package programers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName    : programers.level_0
 * fileName       : Solution181921
 * author         : Hansu
 * date           : 2024-11-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-26        shn81       최초 생성
 */
public class Solution181921 {
    static Integer[] solution(int l, int r) {
        List<Integer> five = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String tmp = i + "";
            boolean check = true;
            for (char c : tmp.toCharArray()) {
                if (c != '0' && c != '5') {
                    check = false;
                }
            }
            if (check) five.add(Integer.parseInt(tmp));
        }

        return five.isEmpty() ? new Integer[]{-1} : five.toArray(Integer[]::new);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, 555)));
        System.out.println(Arrays.toString(solution(10, 20)));
    }
}
