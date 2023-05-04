package home.junseok;

import java.util.Scanner;

public class Factorial {

    private static int[] array;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int i = sc.nextInt();
        array = new int[i];
        logic(i);
        for (int i1 : array) {
            System.out.println(i1);
        }
    }

    private static void logic(int i) {
        if (i == 0) {
            return;
        }
        array[i - 1] = i;
        i--;
        logic(i);
    }
}
