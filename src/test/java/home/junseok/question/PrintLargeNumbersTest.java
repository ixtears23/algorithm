package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PrintLargeNumbersTest {


    private PrintLargeNumbers printLargeNumbers;

    @BeforeEach
    void setUp() {
        printLargeNumbers = new PrintLargeNumbers();
    }

    @Test
    void nothing() {
        // given
        int input1 = 6;
        String input2 = "7 3 9 5 6 12";
        String expectedAnswer = "7 9 6 12";

        // when
        String answer = printLargeNumbers.solution(input1, input2);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
