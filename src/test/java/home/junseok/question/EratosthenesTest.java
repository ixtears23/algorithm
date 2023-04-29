package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EratosthenesTest {

    private Eratosthenes eratosThenes;

    @BeforeEach
    void setUp() {
        this.eratosThenes = new Eratosthenes();
    }

    @Test
    void nothing() {
        // given
        int n = 20;
        int expectedNumber = 8;

        // when
        int result = this.eratosThenes.solution(n);

        // then
        assertThat(result).isEqualTo(expectedNumber);
    }
}
