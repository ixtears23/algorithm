package home.junseok.question;

public class Eratosthenes {

    /*
        자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
        만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
     */
    public int solution(int n) {

        int[] primeNumbers = new int[n + 1];
        int primeNumberCount = 0;

        for (int i = 2; i < primeNumbers.length; i++) {

            if (primeNumbers[i] == 0) {
                primeNumberCount++;
                primeNumbers[i] = 1;
            }

            for (int j = 2; j < primeNumbers.length; j++) {

                if (i * j < primeNumbers.length && primeNumbers[i * j] == 0) {
                    primeNumbers[i * j] = 1;
                }
            }
        }

        return primeNumberCount;
    }
}
