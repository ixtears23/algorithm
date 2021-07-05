package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class WordFlipTest {

    private WordFlip wordFlip;

    @BeforeEach
    void setUp() {
        wordFlip = new WordFlip();
    }

    @Test
    void solutionTest() {
        // given
        int n = 3;
        String[] words = new String[] {"good", "Time", "Big"};
        String[] expectedAnswer = new String[] {"doog", "emiT", "giB"};

        // when
        String[] answer = wordFlip.solution(n, words);

        // then
        for (int i = 0; i < n; i++) {
            assertThat(answer[i]).isEqualTo(expectedAnswer[i]);
        }
    }

    @Test
    void solution2Test() {
        // given
        int n = 3;
        String[] words = new String[] {"good", "Time", "Big"};
        String[] expectedAnswer = new String[] {"doog", "emiT", "giB"};

        // when
        ArrayList<String> answer = wordFlip.solution2(n, words);

        // then
        for (int i = 0; i < n; i++) {
            assertThat(answer.get(i)).isEqualTo(expectedAnswer[i]);
        }
    }

    @Test
    void solution3Test() {
        // given
        int n = 3;
        String[] words = new String[] {"good", "Time", "Big"};
        String[] expectedAnswer = new String[] {"doog", "emiT", "giB"};

        // when
        ArrayList<String> answer = wordFlip.solution3(n, words);

        // then
        for (int i = 0; i < n; i++) {
            assertThat(answer.get(i)).isEqualTo(expectedAnswer[i]);
        }
    }
}
