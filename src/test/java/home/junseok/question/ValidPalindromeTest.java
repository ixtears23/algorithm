package home.junseok.question;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @BeforeEach
    void setUp() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    void solutionTest() {
        // given
        final String input = "found7, time: study; Yduts; emit, 7Dnuof";
        final String expectedAnswer = "YES";

        // when
        String answer = validPalindrome.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest2() {
        // given
        final String input = "found7, time: study; Yduts; emit, 7Dnuof";
        final String expectedAnswer = "YES";

        // when
        String answer = validPalindrome.solution2(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest3() {
        // given
        final String input = "found7, time: study; Yduts; emit, 7Dnuof";
        final String expectedAnswer = "YES";

        // when
        String answer = validPalindrome.solution3(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}