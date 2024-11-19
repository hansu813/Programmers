package programers.level_0;

/**
 * packageName    : programers
 * fileName       : Solution181869
 * author         : Hansu
 * date           : 2024-11-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-13        shn81       최초 생성
 */
public class Solution181869 {
    public static String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        return answer;
    }

    public static void main(String[] args) {
        String[] temp = solution("i love you");
        StringBuffer result = new StringBuffer();
        result.append("[");
        for (String string : temp) {
            result.append("\"" + string + "\", ");
        }
        result.append("]");

        System.out.println(result);
    }
}
