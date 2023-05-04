package home.junseok.factorial;

public class Factorial02 {
    public static void main(String[] args) {
        System.out.println(factorial(13));
    }

    private static int factorial(int number) {
        if (number == 1) return number;
        return number + factorial(number - 1);
    }
}
