package home.junseok.question;

public class RemoveDuplicateCharacters {

    public String solution(String input) {

        String answer = "";

        char[] chars = input.toCharArray();
        answer += chars[0];

        for (int i = 0; i < chars.length; i++) {
            if (answer.indexOf(chars[i]) == -1) {
                answer += chars[i];
            }
        }

        return answer;
    }

    public String solution2(String input) {
        String answer = "";

        for (int i = 0; i < input.length(); i++) {
            if (i == input.indexOf(input.charAt(i))) {
                answer += input.charAt(i);
            }
        }
        return answer;
    }
}
