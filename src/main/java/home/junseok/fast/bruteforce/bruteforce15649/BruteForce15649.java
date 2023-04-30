package home.junseok.fast.bruteforce.bruteforce15649;


import java.util.Scanner;

/**
 * <h2>문제</h2>
 * <p>
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * </p>
 * <li>1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열</li>
 */
public class BruteForce15649 {

    private static final int N; // 가장 큰 자연수
    private static final int M; // 수열 길이
    private static final int[] exploredSequence; // 탐색된 수열
    private static final int[] usedNumberArray; // 사용된 숫자 목록
    private static final StringBuilder SB;

    public static final String SPACE;
    public static final String NEW_LINE;

    // 초기화
    static {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        exploredSequence = new int[M];
        usedNumberArray = new int[N + 1];
        SB =  new StringBuilder();
        SPACE = " ";
        NEW_LINE = "\n";
    }

    public static void main(String[] args) {
        recFunc(0);
        print();
    }

    private static void recFunc(final int k) {
        // 모두 찾으면 M만큼 출력
        if (k == M) {
            for (int i = 0; i < M; i++) {
                SB.append(exploredSequence[i]);
                if (i < M - 1) SB.append(SPACE);
            }
            SB.append(NEW_LINE);

            return;
        }

        // 모두 찾지 않으면, 계속해서 찾는다.
        // 여기서 sequenceList에 넣는다
        for (int naturalNumber = 1; naturalNumber <= N; naturalNumber++) {
            if (usedNumberArray[naturalNumber] == 1) {
                continue;
            }

            exploredSequence[k] = naturalNumber;
            usedNumberArray[naturalNumber] = 1;
            recFunc(k + 1);
            usedNumberArray[naturalNumber] = 0;
        }

    }

    private static void print() {
        System.out.println(SB);
    }

}
