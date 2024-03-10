package Solution;

/**
 * packageName    : Solution
 * fileName       : Solution12931
 * author         : Hansu
 * date           : 2024-03-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-10        shn81       최초 생성
 */
public class Solution12931 {
    public int solution(int n) {
        String tmp = String.valueOf(n);
        int answer = 0;
        for (char c : tmp.toCharArray()) {
            answer += c - '0';
        }
        return answer;
    }
}
