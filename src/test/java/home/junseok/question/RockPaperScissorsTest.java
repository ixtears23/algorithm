package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RockPaperScissorsTest {

    private RockPaperScissors rockPaperScissors;

    @BeforeEach
    void setUp() {
        rockPaperScissors = new RockPaperScissors();
    }

    @Test
    void solutionTest() {

        // given
        int cnt = 5;
        String input1 = "2 3 3 1 3";
        String input2 = "1 1 2 2 3";
        String expectedAnswer = "ABABD";

        // when
        String answer = rockPaperScissors.solution(cnt, input1, input2);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
