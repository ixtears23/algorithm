package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CaseConversionTest {

    private CaseConversion conversion;

    @BeforeEach
    void setUp() {
        conversion = new CaseConversion();
    }

    @Test
    void solutionTest() {

        // given
        String input = "StuDY";
        String expectedAnswer = "sTUdy";

        // when
        String answer = conversion.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest2() {

        // given
        String input = "StuDY";
        String expectedAnswer = "sTUdy";

        // when
        String answer = conversion.solution2(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest3() {

        // given
        String input = "StuDY";
        String expectedAnswer = "sTUdy";

        // when
        String answer = conversion.solution3(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
