package home.junseok.fibonacci;

public class Fibonacci02 {

    static int fibonacci(int n) {
        int sum = 0;
        int prevSum = 1;
        int prevPrevSum = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == 2) {
                sum = 1;
            } else {
                sum = prevSum + prevPrevSum;
                prevPrevSum = prevSum;
                prevSum = sum;
            }
        }

        return sum;
    }
}
