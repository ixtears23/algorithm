package home.junseok.question;

public class FibonacciSequence {
    public int[] solution(int input) {
        int[] expectedAnswer = new int[input];
        expectedAnswer[0] = 1;
        expectedAnswer[1] = 1;

        for (int i = 0; i < input - 2; i++) {
            expectedAnswer[i + 2] = expectedAnswer[i] + expectedAnswer[i + 1];
        }

        return expectedAnswer;
    }
}
