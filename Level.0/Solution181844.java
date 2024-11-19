package programers.level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : programers.level_0
 * fileName       : Solution181844
 * author         : Hansu
 * date           : 2024-11-15
 * description    : 배열의 원소 삭제하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-15        shn81       최초 생성
 */
public class Solution181844 {
    public static Integer[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for (Integer num : arr) {
            list.add(num);
        }
        for (Integer num : delete_list) {
            list.remove(num);
        }
        return list.toArray(Integer[] :: new);
    }

    public static void main(String[] args) {

    }
}
