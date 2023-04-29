package home.junseok.question;

import java.util.Scanner;

public class Wrestler {

    public static int solution(Integer[][] s) {

        int count = s.length;

        for (int i = 0; i < s.length; i++) {
            int a1 = s[i][0];
            int a2 = s[i][1];

            for (int j = 0; j < s.length; j++) {
                if (a1 < s[j][0] && a2 < s[j][1]) {
                    count--;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        Integer[][] s1 = new Integer[Integer.parseInt(s)][2];

        for (int i = 0; i < Integer.parseInt(s); i++) {
            final String[] s2 = scanner.nextLine().split(" ");
            s1[i][0] = Integer.parseInt(s2[0]);
            s1[i][1] = Integer.parseInt(s2[1]);
        }

        System.out.println(solution(s1));
    }
}
