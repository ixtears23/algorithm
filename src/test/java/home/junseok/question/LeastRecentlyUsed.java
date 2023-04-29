package home.junseok.question;

import java.util.Arrays;
import java.util.Scanner;

public class LeastRecentlyUsed {

    public static String[] solution(int cacheSize, int threadCount, String[] threads) {

        final String[] caches = new String[cacheSize];
        int cacheHit = 0;

        caches[0] = threads[0];
        for (int i = 1; i < threadCount; i++) {
            caches[i] = caches[i - 1];

            for (int j = 1; j < cacheSize; j++) {
                if (threads[i].equals(caches[j])) {
                    cacheHit = j;

                    for (int k = cacheHit; k > 1; k--) {
                        caches[k] = caches[k - 1];
                    }
                    caches[0] = threads[i];
                    break;
                }
            }
            caches[i] = threads[i];
        }





        return caches;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String input1 = scanner.nextLine();
        final String[] inputs1 = input1.split(" ");
        final int cacheSize = Integer.parseInt(inputs1[0]);
        final int threadCount = Integer.parseInt(inputs1[1]);
        final String input3 = scanner.nextLine();
        final String[] threads = input3.split(" ");
        Arrays.stream(solution(cacheSize, threadCount, threads)).forEach(System.out::println);
    }

}
