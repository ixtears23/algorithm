package home.junseok.question;

public class WordsInASentence {

    public String solution(String input) {

        String[] strArray = input.split(" ");
        String answer = "";

        for (String str : strArray) {
            if (str.length() > answer.length()) {
                answer = str;
            }
        }

        return answer;
    }

    public String solution2(String input) {

        String[] strArray = input.split(" ");
        String answer = "";
        int m = Integer.MIN_VALUE;

        for (String str : strArray) {
            int len = str.length();
            if (len > m) {
                m = len;
                answer = str;
            }
        }

        return answer;
    }

    public String solution3(String input) {

        String[] strArray = input.split(" ");
        String answer = "";

        for (String str : strArray) {
            if (str.length() > answer.length()) {
                answer = str;
            }
        }

        return answer;
    }

}
