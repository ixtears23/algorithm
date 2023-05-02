package home.junseok.fast.bruteforce.bruteforce14888;

import java.util.Scanner;

/**
 * <h2>완전탐색 - 응용</h2>
 */
public class BruteForce14888 {

    private static int n;
    private static int[] numberList;
    private static int[] operationCountArray;
    private static int plusCount;
    private static int minusCount;
    private static int divisionCount;
    private static int multiplicationCount;

    private static int minValue = 0;
    private static int maxValue = 0;

    public static void main(String[] args) {
        input();
        logic();
    }
    // 연산자로 경우의 수 구하기 (연산자 완전 탐색), 중복가능, 여러번 ???? 어떻게 구해야 되는거지...

    // 연산을 재귀호출로 해야 되지 않나?
    private static void logic() {



    }

    private static void input() {
        Scanner scanner = new Scanner(System.in);
        n = Integer.parseInt(scanner.nextLine());

        final String[] secondLine = scanner.nextLine().split(" ");
        numberList = new int[secondLine.length];
        for (int i = 0; i < secondLine.length; i++) {
            numberList[i] = Integer.parseInt(secondLine[i]);
        }

        final String[] thirdLine = scanner.nextLine().split(" ");
        operationCountArray = new int[thirdLine.length];
        plusCount = Integer.parseInt(thirdLine[0]);
        minusCount = Integer.parseInt(thirdLine[1]);
        divisionCount = Integer.parseInt(thirdLine[2]);
        multiplicationCount = Integer.parseInt(thirdLine[3]);
    }

}
