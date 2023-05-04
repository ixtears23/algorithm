package home.junseok.fibonacci;

public class Fibonacci01 {

    private static int i = 0;

    public static void main(String[] args) {
        System.out.println(fibonacci(12));
    }

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
