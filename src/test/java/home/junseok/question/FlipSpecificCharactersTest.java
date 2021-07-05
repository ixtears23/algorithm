package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FlipSpecificCharactersTest {

    private FlipSpecificCharacters flipSpecificCharacters;

    @BeforeEach
    void setUp() {
        flipSpecificCharacters = new FlipSpecificCharacters();
    }

    @Test
    @DisplayName("알파벳만 뒤집힌 문자열을 출력")
    void solutionTest() {
        
        // given
        String input = "a#b!GE*T@S";
        String expectedAnswer = "S#T!EG*b@a";

        // when
        String answer = flipSpecificCharacters.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
