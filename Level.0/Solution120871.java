package programers.level_0;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120871
 * author         : Hansu
 * date           : 2024-11-28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-28        shn81       최초 생성
 */
public class Solution120871 {
    static int solution(int n) {
        int answer = 0;
        int idx = 0;
        while (idx++ < n) {
            answer++;
            while (answer % 3 == 0 || Integer.toString(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }
}
