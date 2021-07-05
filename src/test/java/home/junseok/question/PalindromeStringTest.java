package home.junseok.question;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PalindromeStringTest {

    private PalindromeString palindromeString;

    @BeforeEach
    void setUp() {
        palindromeString = new PalindromeString();
    }

    @Test
    void solutionTest() {
        // given
        String input = "gooG";
        String expectedAnswer = "YES";

        // when
        String answer = palindromeString.solution(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }

    @Test
    void solutionTest2() {
        // given
        String input = "gooG";
        String expectedAnswer = "YES";

        // when
        String answer = palindromeString.solution2(input);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}