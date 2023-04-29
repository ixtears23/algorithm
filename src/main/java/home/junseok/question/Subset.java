package home.junseok.question;

public class Subset {
    private static final int LEVEL = 3;
    private static final int[] ELEMENT_ARRAY = new int[LEVEL + 1];

    public void DFS(int element) {

        if (element == LEVEL + 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < ELEMENT_ARRAY.length; i++) {
                if (ELEMENT_ARRAY[i] == 1) {
                    sb.append(i);
                }
            }
            System.out.println(sb.toString());
        }

        ELEMENT_ARRAY[element] = 1;
        DFS(element + 1);
        ELEMENT_ARRAY[element] = 0;
        DFS(element + 1);
    }

    public static void main(String[] args) {

        final Subset subset = new Subset();
        subset.DFS(1);
    }

}
