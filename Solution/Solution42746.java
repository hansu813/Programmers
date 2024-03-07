package Solution;

import java.util.Arrays;

/**
 * packageName    : Solution
 * fileName       : Solution42746
 * author         : Hansu
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07        shn81       최초 생성
 */

public class Solution42746 {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        if (arr[0].equals("0")) return "0";

        StringBuilder answer = new StringBuilder();
        for (String str : arr) {
            answer.append(str);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution42746 s = new Solution42746();
    }
}
