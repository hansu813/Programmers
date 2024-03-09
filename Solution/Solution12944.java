package Solution;

import java.util.Arrays;

/**
 * packageName    : Solution
 * fileName       : Solution12944
 * author         : Hansu
 * date           : 2024-03-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-09        shn81       최초 생성
 */
public class Solution12944 {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).sum();
        return answer / arr.length;
    }
}
