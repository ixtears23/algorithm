package junseok.home.question;

public class CaseConversion {

    // A ~ Z : 65 ~ 90
    // a ~ z : 97 - 122
    // input : StuDY
    // output : sTUdy
    public String solution(String input) {

        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c >= 65 && c <= 90) {
                answer.append(Character.toLowerCase(c));
            }
            if (c >= 97 && c <= 122) {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }

    public String solution2(String input) {

        StringBuilder answer = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                answer.append(Character.toLowerCase(c));
            }
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            }
        }

        return answer.toString();
    }
}
