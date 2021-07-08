package home.junseok.question;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CipherTest {

    private Cipher cipher;

    @BeforeEach
    void setUp() {
        cipher = new Cipher();
    }

    @Test
    void nothing() {
        // given
        int len = 4;
        String cipherText = "#****###**#####**#####**##**";
        String expectedAnswer = "COOL";

        // when
        String answer = cipher.solution(len, cipherText);

        // then
        assertThat(answer).isEqualTo(expectedAnswer);
    }
}
