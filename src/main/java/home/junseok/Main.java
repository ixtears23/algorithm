package home.junseok;

import java.util.Scanner;

public class Main {

    public static int solution(int n) {

        int[] primeNumbers = new int[n + 1];
        int primeNumberCount = 0;

        for (int i = 2; i < primeNumbers.length; i++) {

            if (primeNumbers[i] == 0) {
                primeNumberCount++;

                for (int j = i; j < primeNumbers.length; j = j + i) {
                    primeNumbers[j] = 1;
                }
            }
        }

        return primeNumberCount;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        int answer = solution(input1);
        System.out.println(answer);
    }
}