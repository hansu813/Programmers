package programers.level_0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : programers.level_0
 * fileName       : Solution181867
 * author         : Hansu
 * date           : 2024-11-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-14        shn81       최초 생성
 */
public class Solution181867 {
    public static Integer[] solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String string : myString.split("x")) {
            list.add(string.length());
        }
        if (myString.charAt(myString.length() - 1) == 'x') list.add(0);
        return list.toArray(new Integer[list.size()]);
    }

    public static void main(String[] args) {
        for (int i : solution("oxooxoxxox")) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : solution("xabcxdefxghi")) {
            System.out.print(i + " ");
        }
    }
}
