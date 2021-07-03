package junseok.home.question;

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
}
