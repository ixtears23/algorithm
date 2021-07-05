package home.junseok.question;

public class ValidPalindrome {

    public String solution(String input) {
        String answer = "YES";
        input = input.toUpperCase();
        input = input.replaceAll("[^A-Z]", "");
        int len = input.length();

        for (int i = 0; i < len/2; i++) {

            char a = input.charAt(i);
            char b = input.charAt(len - i - 1);

            if (Character.isAlphabetic(a) || Character.isAlphabetic(b)) {
                if (a != b) {
                    return "NO";
                }
            }
        }

        return answer;
    }


    public String solution2(String input) {

        String answer = "YES";
        input = input.toUpperCase();
        input = input.replaceAll("[^A-Z]", "");

        int lt = 0;
        int rt = input.length() - 1;

        while (lt < rt) {
            if (Character.isAlphabetic(input.charAt(lt)) || (Character.isAlphabetic(input.charAt(rt)))) {
                if (input.charAt(lt) != input.charAt(rt)) {
                    return "NO";
                }
            }
            lt++;
            rt--;
        }

        return answer;
    }

    public String solution3(String input) {
        String answer = "NO";

        input = input.toUpperCase().replaceAll("[^A-Z]", "");

        String temp = new StringBuilder(input).reverse().toString();
        if (input.equals(temp)) {
            return "YES";
        }

        return answer;
    }
}
