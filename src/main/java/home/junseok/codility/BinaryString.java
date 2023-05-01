package home.junseok.codility;

/**
 * <h2>이진 갭</h2>
 */
public class BinaryString {

    private static final StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        toBinaryString(1162);
        System.out.println(getBinaryGap());
    }

    private static int getBinaryGap() {
        final String binayString = sb.reverse().toString();
        System.out.println(binayString);

        int max = 0;
        int temp = 0;

        boolean isStart = false;
        boolean isEnd = false;

        for (char b : binayString.toCharArray()) {
            if (b == '1' && !isStart) {
                isStart = true;
            } else if (isStart && b == '0') {
                temp++;
            } else if (b == '1' && isStart) {
                isEnd = true;
            }

            if (isStart && isEnd) {
                isEnd = false;
                if (max < temp) {
                    max = temp;
                }
                temp = 0;
            }
        }

        return max;
    }

    private static void toBinaryString(int n) {
        while (n > 0) {
            int bit = n % 2;
            sb.append(bit);
            n /= 2;
        }
    }

}
