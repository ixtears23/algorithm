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

}
