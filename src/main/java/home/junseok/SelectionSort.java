package home.junseok;

public class SelectionSort {

    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            var temporary = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temporary = array[i];
                    array[i] = array[j];
                    array[j] = temporary;
                }
            }
        }

        return array;
    }
}
