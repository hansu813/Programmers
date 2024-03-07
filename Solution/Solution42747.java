package Solution;

import java.util.Arrays;

/**
 * packageName    : Solution
 * fileName       : Solution42747
 * author         : Hansu
 * date           : 2024-03-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-07        shn81       최초 생성
 */
public class Solution42747 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            if (citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
