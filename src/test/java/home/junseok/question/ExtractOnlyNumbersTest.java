package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExtractOnlyNumbersTest {

    private ExtractOnlyNumbers extractOnlyNumbers;

    @BeforeEach
    void setUp() {
        extractOnlyNumbers = new ExtractOnlyNumbers();
    }

    @Test
    void solutionTest() {

        String input = "g0en2T0s8eSoft";
        String expectedAnswer = "208";

        String answer = extractOnlyNumbers.solution(input);

        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest2() {

        String input = "g0en2T0s8eSoft";
        String expectedAnswer = "208";

        String answer = extractOnlyNumbers.solution2(input);

        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest3() {

        String input = "g0en2T0s8eSoft";
        String expectedAnswer = "208";

        String answer = extractOnlyNumbers.solution3(input);

        assertThat(answer).isEqualTo(expectedAnswer);
    }

}