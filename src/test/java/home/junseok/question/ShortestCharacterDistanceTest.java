package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ShortestCharacterDistanceTest {

    private ShortestCharacterDistance shortestCharacterDistance;

    @BeforeEach
    void setUp() {
        shortestCharacterDistance = new ShortestCharacterDistance();
    }

    @Test
    void solutionTest() {
        String input1 = "teachermode";
        char input2 = 'e';
        int[] expectedAnswer = new int[]{1, 0, 1, 2, 1, 0, 1, 2, 2, 1, 0};

        int[] answer = shortestCharacterDistance.solution(input1, input2);

        for (int i = 0; i < expectedAnswer.length; i++) {
            assertThat(answer[i]).isEqualTo(expectedAnswer[i]);
        }
    }
}