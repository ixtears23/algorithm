package junseok.home;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CountingTest {

    private Counting counting;

    @BeforeEach
    void setUp() {
        counting = new Counting();
    }

    @Test
    void threadCountTest() {

        // given
        // setUp()

        // when
        counting.execute();
    }
}
