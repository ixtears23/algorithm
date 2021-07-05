package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class RemoveDuplicateCharactersTest {

    private RemoveDuplicateCharacters removeDuplicateCharacters;

    @BeforeEach
    void setUp() {
        removeDuplicateCharacters = new RemoveDuplicateCharacters();
    }

    @Test
    void solutionTest() {
        // given
        final String input = "ksekkset";
        final String expectedAnswer = "kset";

        // when
        String answer = removeDuplicateCharacters.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
    @Test
    void solutionTest2() {
        // given
        final String input = "ksekkset";
        final String expectedAnswer = "kset";

        // when
        String answer = removeDuplicateCharacters.solution2(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
