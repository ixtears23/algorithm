package home.junseok.fast.bruteforce.bruteforce15650;


import java.util.Scanner;

public class BruteForce15650 {

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

        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = selected[k - 1] + 1; i <= n; i++) {
            selected[k] = i;
            recFunc(k + 1);
        }
    }


    private static void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        selected = new int[m + 1];
    }
}
