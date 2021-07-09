package home.junseok.question;

public class PrintLargeNumbers {
    public String solution(int input1, String input2) {
        String answer = String.valueOf(input2.charAt(0));

        String[] s = input2.split(" ");

        for (int i = 1; i < s.length; i++) {
            if (Integer.parseInt(s[i - 1]) < Integer.parseInt(s[i])) {
                answer += " " + Integer.parseInt(s[i]);
            }
        }
        return answer;
    }
}
