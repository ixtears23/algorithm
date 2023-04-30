package home.junseok.fast.bruteforce.bruteforce15651;

import java.util.Scanner;

/**
 * 완전탐색[1]
 * https://www.acmicpc.net/problem/15651
 * 문제 : 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * - 1부터 N까지 자연수 중에서 M개를 고른 수열
 * - 같은 수를 여러 번 골라도 된다.
 */
public class Bruteforce15651_fast {

    private static int n; // 4
    private static int m; // 3
    private static final StringBuilder sb = new StringBuilder();
    private static int[] selected;

    public static void main(String[] args) {
        input();
        logic(1);
        print();
    }

    private static void logic(int k) {
        if (k == m + 1) {
            for (int i = 1; i <= m; i++) {
                sb.append(selected[i]);
                sb.append(" ");
            }
            sb.append("\n");
        } else {
            for (int cand = 1; cand <= n; cand++) {
                selected[k] = cand;
                logic(k + 1);
//                selected[k] = 0;
            }
        }
    }

    private static void input() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        selected = new int[m + 1];
    }

    private static void print() {
        System.out.println(sb);
    }

}
