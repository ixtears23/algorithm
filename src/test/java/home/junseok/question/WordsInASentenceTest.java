package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class WordsInASentenceTest {

    private WordsInASentence wordsInASentence;

    @BeforeEach
    void setUp() {
        wordsInASentence = new WordsInASentence();
    }

    @Test
    void solutionTest() {

        // given
        String input = "it is time to study";
        String expectedAnswer = "study";

        // when
        String answer = wordsInASentence.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest2() {

        // given
        String input = "it is time to study";
        String expectedAnswer = "study";

        // when
        String answer = wordsInASentence.solution2(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest3() {

        // given
        String input = "it is time to study";
        String expectedAnswer = "study";

        // when
        String answer = wordsInASentence.solution3(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}