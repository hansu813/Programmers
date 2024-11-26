package programers.level_0;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120880
 * author         : Hansu
 * date           : 2024-11-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-26        shn81       최초 생성
 */
public class Solution120880 {
    static Integer[] solution(int[] numlist, int n) {
        Integer[] answer = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        Arrays.sort(answer, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int a = Math.abs(o1 - n);
                int b = Math.abs(o2 - n);

                return a == b ? (o1 > o2 ? -1 : 1) : a - b;
            }
        });
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{10000, 20, 36, 47, 40, 6, 10, 7000}, 30)));
    }
}
