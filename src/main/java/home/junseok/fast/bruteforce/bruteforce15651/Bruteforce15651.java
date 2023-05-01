package home.junseok.fast.bruteforce.bruteforce15651;

import java.util.Scanner;

/**
 * <h2>완전 탐색</h2>
 */
public class Bruteforce15651 {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int N = SCANNER.nextInt();
    private static final int M = SCANNER.nextInt();
    private static final int[] SEQUENCE_LIST = new int[M];
    private static final StringBuilder SB = new StringBuilder();

    public static void main(String[] args) {
        recLogic(0);
        System.out.println(SB);
    }

    private static void recLogic(int k) {
        if (k == M) {
            for (int i = 0; i < M; i++) {
                SB.append(SEQUENCE_LIST[i]);
                if (i < M - 1) SB.append(" ");
            }
            SB.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            SEQUENCE_LIST[k] = i;
            recLogic(k + 1);
        }
    }
}
