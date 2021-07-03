package junseok.home.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FindACharacterTest {

    private FindACharacter findACharacter;

    @BeforeEach
    void setUp() {
        findACharacter = new FindACharacter();
    }

    @Test
    @DisplayName("문자열과 문자가 주어졌을 때 문자열에 포함된 문자의 개수 구하기")
    void solutionTest() {

        // given
        String str = "Computercoolerc";
        char ch = 'c';

        // when
        int count = findACharacter.solution(str, ch);

        // then
        assertThat(count).isEqualTo(2);
    }

    @ParameterizedTest
    @MethodSource("stringAndChar")
    void solutionTests(String str, char c, int answer) {

        // when
        int count = findACharacter.solution(str, c);

        // then
        assertThat(count).isEqualTo(answer);
    }

    @ParameterizedTest
    @MethodSource("stringAndChar")
    void solution2Test(String str, char c, int answer) {

        // when
        int count = findACharacter.solution2(str, c);

        // then
        assertThat(count).isEqualTo(answer);
    }


    static Stream<Arguments> stringAndChar() {
        return Stream.of(
                arguments(
                        "Computercoolerc", 'c', 3
                ),
                arguments(
                        "Computercooler", 'c', 2
                ),
                arguments(
                        "doriDorido", 'd', 3
                )
        );
    }
}
