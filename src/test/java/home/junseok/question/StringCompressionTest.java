package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.stream.Stream;


public class StringCompressionTest {

    private StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void solutionTest(String input, String expectedAnswer) {

        // when
        String answer = stringCompression.solution(input);

        // then0
        assertThat(answer).isEqualTo(expectedAnswer);

    }


    @ParameterizedTest
    @MethodSource("parameters")
    void solutionTest2(String input, String expectedAnswer) {

        // when
        String answer = stringCompression.solution2(input);

        // then0
        assertThat(answer).isEqualTo(expectedAnswer);

    }

    static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.arguments("KKHSSSSSSSE", "K2HS7E"),
                Arguments.arguments("KSTTTSEEKFKKKDJJGG", "KST3SE2KFK3DJ2G2")
        );

    }
}
