package home.junseok.question;

public class FlipSpecificCharacters {

    public String solution(String word) {

        char[] chars = word.toCharArray();
        String answer = "";

        int lt = 0;
        int rt = word.toCharArray().length - 1;
        while (lt < rt) {

            if (!Character.isAlphabetic(chars[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(chars[rt])) {
                rt--;
            } else {
                char temp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = temp;
                lt++;
                rt--;
            }
        }

        for (char c : chars) {
            answer += String.valueOf(c);
        }

        return answer;
    }
}
