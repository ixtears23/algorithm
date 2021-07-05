package home.junseok.question;

public class ExtractOnlyNumbers {

    public String solution(String input) {
        // g0en2T0s8eSoft
        // 208
        return String.valueOf(Integer.parseInt(input.replaceAll("[^0-9]", "")));
    }

    public String solution2(String input) {

        int answer = 0;
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (c >= 48 && c <= 57) {
                //answer = answer * 10 + Integer.parseInt(String.valueOf(c));
                answer = answer * 10 + (c-48);
            }
        }

        return String.valueOf(answer);
    }

    public String solution3(String input) {

        int answer = 0;
        char[] chars = input.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                //answer = answer * 10 + Integer.parseInt(String.valueOf(c));
                answer = answer * 10 + (c-48);
            }
        }

        return String.valueOf(answer);
    }
}
