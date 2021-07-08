package home.junseok.question;

public class StringCompression {

    public String solution(String input) {
        // KKHSSSSSSSE K2HS7E
        // KSTTTSEEKFKKKDJJGG KST3SE2KFK3DJ2G2
        String answer = Character.toString(input.charAt(0));

        char temp = input.charAt(0);
        int number = 1;
        for (int i = 1; i < input.length(); i++) {
            if (temp == input.charAt(i)) {
                number++;
                if (i == input.length() - 1) {
                    answer = answer + number;
                }
            } else {
                if (number == 1) {
                    answer = answer + input.charAt(i);
                    temp = input.charAt(i);
                } else {
                    answer = answer + number + input.charAt(i);
                    temp = input.charAt(i);
                    number = 1;
                }
            }
        }

        return answer;
    }

    public String solution2(String input) {
        input += " ";
        String answer = "";
        int number = 1;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                number++;
            } else {
                if (number == 1) {
                    answer = answer + input.charAt(i);
                } else {
                    answer = answer + input.charAt(i) + number;
                    number = 1;
                }
            }
        }

        return answer;
    }
}
