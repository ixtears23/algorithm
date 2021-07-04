package home.junseok;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;


class SelectionSortTest {

    @Test
    void sortTest() {
        
        // given
        int[] array = new int[] { 6, 2, 3, 4, 1, 7 };
        int[] expected = new int[] { 1, 2, 3, 4, 6, 7 };
        
        // when
        int[] sortedArray = new SelectionSort().sort(array);

        //then
        assertThat(sortedArray).containsOnly(expected);
    }
}
