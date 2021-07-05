package home.junseok.question;

public class PalindromeString {
    public String solution(String input) {
        String answer = "YES";

        char[] chars = input.toUpperCase().toCharArray();

        int lt = 0;
        int rt = input.length() - 1;

        while (lt < rt) {

            if (chars[lt] != chars[rt]) {
                answer = "NO";
                break;
            }
            lt++;
            rt--;
        }
        return  answer;
    }

    public String solution2(String input) {
        String answer = "YES";

        input = input.toUpperCase();

        int len = input.length();

        for (int i = 0; i < len/2; i++) {
            if (input.charAt(i) != input.charAt(len-i-1)) {
                return "NO";
            }
        }

        return answer;
    }

    public String solution3(String input) {
        String answer = "NO";
        String tmp = new StringBuilder(input).reverse().toString();
        if (input.equalsIgnoreCase(tmp)) answer = "YES";

        return answer;
    }
}
