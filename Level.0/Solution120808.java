package programers.level_0;

/**
 * packageName    : programers.level_0
 * fileName       : Solution120808
 * author         : Hansu
 * date           : 2024-11-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-11-25        shn81       최초 생성
 */
public class Solution120808 {
    static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1), denom = denom1 * denom2;

        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= denom && i <= numer; i++) {
            if (denom % i == 0 && numer % i == 0) {
                max = i;
            }
        }
        return new int[]{numer / max, denom / max};
    }

    public static void main(String[] args) {

    }
}
