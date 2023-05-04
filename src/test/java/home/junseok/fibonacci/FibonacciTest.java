package home.junseok.fibonacci;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34",
            "10, 55",
            "11, 89",
            "12, 144"
    })
    void fibonacci01Test(int index, int expectedValue) {
        assertThat(Fibonacci01.fibonacci(index)).isEqualTo(expectedValue);
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "5, 5",
            "6, 8",
            "7, 13",
            "8, 21",
            "9, 34",
            "10, 55",
            "11, 89",
            "12, 144"
    })
    void fibonacci02Test(int index, int expectedValue) {
        assertThat(Fibonacci02.fibonacci(index)).isEqualTo(expectedValue);
    }

}