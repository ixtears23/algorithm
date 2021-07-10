package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciSequenceTest {

    private FibonacciSequence fibonacciSequence;

    @BeforeEach
    void setUp() {
        fibonacciSequence = new FibonacciSequence();
    }

    @Test
    void solutionTest() {
        // given
        int input = 10;
        String expectedAnswer = "1 1 2 3 5 8 13 21 34 55";
        String answer = "";
        // when
        for (int i : fibonacciSequence.solution(input)) {
            answer = answer + i + " ";
        }

        answer = answer.substring(0, answer.length() - 1);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
