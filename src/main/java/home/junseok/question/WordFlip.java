package home.junseok.question;

public class WordFlip {

    public String[] solution(int n, String[] words) {

        String[] answer = new String[n];

        for (int i = 0; i < words.length; i++) {
            char[] chars = words[i].toCharArray();
            String flip = "";
            for (int j = chars.length; j > 0; j--) {
                flip += chars[j - 1];
            }
            answer[i] = flip;
        }

        return answer;
    }
}
