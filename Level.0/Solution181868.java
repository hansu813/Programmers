package programers.level_0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : programers
 * fileName       : Solution181868
 * author         : Hansu
 * date           : 2024-11-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-13        shn81       최초 생성
 */
public class Solution181868 {
    public static String[] solution(String my_string) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : my_string.split(" ")) {
            if (!string.isEmpty()) list.add(string);
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        for (String tmp : solution(" i    love  you")) {
            System.out.print(tmp + " ");
        }
    }
}
