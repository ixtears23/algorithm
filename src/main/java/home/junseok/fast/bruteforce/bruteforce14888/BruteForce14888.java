package home.junseok.fast.bruteforce.bruteforce14888;

import java.util.Scanner;

/**
 * <h2>완전탐색 - 응용</h2>
 * <a href='https://www.acmicpc.net/problem/14888'>연산자 끼워넣기</a>
 */
public class BruteForce14888 {

    private static int n;
    private static int[] numberList;
    private static int[] operationCountArray;
    private static int[] orderArray; // 연산 순서 저장 N-1

    /*
        0 : 덧셈, 1 : 뺄셈, 1 : 곱셈, 1 : 나눗셈
     */
    private static int minValue = Integer.MAX_VALUE;
    private static int maxValue = Integer.MIN_VALUE;


    public static void main(String[] args) {
        input();
        logic(0);
        System.out.println(maxValue);
        System.out.println(minValue);
    }


    // 연산자로 경우의 수 구하기 (연산자 완전 탐색), 중복가능, 여러번 ???? 어떻게 구해야 되는거지...

    // 연산을 재귀호출로 해야 되지 않나?
    private static void logic(int k) {
        if (k == n - 1) {
            savedMinAndMaxValue();
            return;
        }
        for (int i = 0; i < 4; i++) {
            if (operationCountArray[i] >= 1) {
                operationCountArray[i]--;
                orderArray[k] = i;
                logic(k + 1);
                operationCountArray[i]++;
                orderArray[k] = 0;
            }
        }

    }

    private static void savedMinAndMaxValue() {
        final int calculated = calculate();
        if (minValue >= calculated) {
            minValue = calculated;
        }
        if (maxValue <= calculated) {
            maxValue = calculated;
        }
    }

    private static int calculate() {
        int calculatedValue = numberList[0];

        for (int i = 1; i < n; i++) {
            if (orderArray[i - 1] == 0) calculatedValue += numberList[i];
            if (orderArray[i - 1] == 1) calculatedValue -= numberList[i];
            if (orderArray[i - 1] == 2) calculatedValue *= numberList[i];
            if (orderArray[i - 1] == 3) calculatedValue /= numberList[i];
        }

        return calculatedValue;
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
        operationCountArray[0] = Integer.parseInt(thirdLine[0]);
        operationCountArray[1] = Integer.parseInt(thirdLine[1]);
        operationCountArray[2] = Integer.parseInt(thirdLine[2]);
        operationCountArray[3] = Integer.parseInt(thirdLine[3]);

        orderArray = new int[n - 1];
    }

    private static void printInput() {
        System.out.println("n : " + n);

        for (int i = 0; i < numberList.length; i++) {
            System.out.println("numberList[" + i + "] : " + numberList[i]);
        }
        for (int i = 0; i < operationCountArray.length; i++) {
            System.out.println("operationCountArray[" + i + "] : " + operationCountArray[i]);
        }
    }

}
