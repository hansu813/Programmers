package programers.level_0;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120956
 * author         : Hansu
 * date           : 2024-11-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-21        shn81       최초 생성
 */
public class Solution120956 {
    static int solution(String[] babbling) {
        int answer = 0;
        String[] can = {"aya", "ye", "woo", "ma"};
        for (String str : babbling) {
            for (String tmp : can) {
                str = str.replaceFirst(tmp, " ");
            }
            str = str.replaceAll(" ", "");
            answer = str.equals("") ? (answer + 1) : answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"}));
    }
}
