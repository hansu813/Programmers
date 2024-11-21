package level_1;

/**
 * packageName    : level_1
 * fileName       : Solution131705
 * author         : Hansu
 * date           : 2024-11-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-21        shn81       최초 생성
 */
public class Solution131705 {
    static int solution(int[] number) {
        int answer = 0;
        int length = number.length;

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    answer += (number[i] + number[j] + number[k]) == 0 ? 1 : 0;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] number = {-2, 3, 0, 2, -5};
        System.out.println(solution(number));

        number = new int[]{-3, -2, -1, 0, 1, 2, 3};
        System.out.println(solution(number));

        number = new int[]{-1, 1, -1, 1};
        System.out.println(solution(number));
    }
}
