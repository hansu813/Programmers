package Solution;

/**
 * packageName    : Solution
 * fileName       : Solution87389
 * author         : Hansu
 * date           : 2024-03-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-03-10        shn81       최초 생성
 */
public class Solution87389 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
