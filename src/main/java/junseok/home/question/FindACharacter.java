package junseok.home.question;

public class FindACharacter {

    public int solution(String str, char ch) {

        str = str.toUpperCase();
        String word = Character.toString(ch);
        word = word.toUpperCase();

        int count = 0;

        while (str.length() > 0) {
            int i = str.indexOf(word);
            if (i > -1 ) {
                str = str.substring(i + 1);
                count++;
            } else {
                break;
            }
        }

        return count;
    }

    public int solution2(String str, char ch) {

        str = str.toUpperCase();
        String word = Character.toString(ch);
        word = word.toUpperCase();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals(word)) {
                count++;
            }
        }

        return count;
    }

    public int solution3(String str, char ch) {

        str = str.toUpperCase();
        ch = Character.toUpperCase(ch);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }
}
