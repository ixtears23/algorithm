package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class StudentWhoSeesTest {

    private StudentWhoSees studentWhoSees;

    @BeforeEach
    void setUp() {
        studentWhoSees = new StudentWhoSees();
    }

    @Test
    void solutionTest() {

        // given
        int input1 = 8;
        String input2 = "130 135 148 140 145 150 150 153";
        int expectedAnswer = 5;

        // when
        int answer = studentWhoSees.solution(input1, input2);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
