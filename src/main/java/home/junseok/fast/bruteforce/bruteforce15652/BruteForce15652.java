package home.junseok.fast.bruteforce.bruteforce15652;

import java.util.Scanner;

/**
 * <h2>완전 탐색</h2>
 */
public class BruteForce15652 {

    private static int n;   // 자연수
    private static int m;   // 수열 길이
    private static int[] selected;
    private static final StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        input();
        recFunc(1);
        System.out.println(sb);
    }

    private static void recFunc(int k) {

        // 모든게 완료되면 출력
        if (m == k - 1) {
            for (int i = 0; i < m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        int x = 1;

        if (k > 1) x = selected[k - 2];

        for (int i = x; i <= n; i++) {
            selected[k - 1] = i;
            recFunc(k + 1);
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        selected = new int[m];
    }
}
