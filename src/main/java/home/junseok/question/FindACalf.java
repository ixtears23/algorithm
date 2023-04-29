package home.junseok.question;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindACalf {
    static int[] count = new int[]{ 1, -1, 5 };
    static int[] already = new int[10001];

    public static int solution(int me, int calf) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(me);

        already[me] = 1;
        int level = 0;
        int checkCount = 1;
        while (!queue.isEmpty()) {

            final int size = queue.size();

            for (int i = 0; i < size; i++) {
                final Integer x = queue.poll();
                if (x == calf) return level;

                for (int j = 0; j < 3; j++) {
                    int z = x + count[j];
                    if (z > 0 && z < 10001 && already[z] == 0) {
                        already[z] = 1;
                        queue.offer(z);
                    }
                }

            }
            level++;
        }
        return 0;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println(solution(scanner.nextInt(), scanner.nextInt()));;
    }
}
