package home.junseok;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @DisplayName("아무것도 없음")
    @ParameterizedTest
    @MethodSource("array")
    void solutionTest(int[] array, int[][] commands, int[] expectedResult) {

        // given
        final int i = 0;

        // when
        int[] solutionResult = new Solution().solution(array, commands);

        // then
        assertThat(solutionResult).contains(expectedResult);
    }

    static Stream<Arguments> array() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{1, 5, 2, 6, 3, 7, 4},
                        new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}},
                        new int[]{5, 6, 3}
                )
        );
    }

    private int execute(int i) {
        return i;
    }

}
