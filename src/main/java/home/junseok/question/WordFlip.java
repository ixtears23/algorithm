package home.junseok.question;

import java.util.ArrayList;

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

    public ArrayList<String> solution2(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }

        return answer;
    }

    public ArrayList<String> solution3(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String x : str) {
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length() - 1;
            while (lt < rt) {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        return answer;
    }
}
