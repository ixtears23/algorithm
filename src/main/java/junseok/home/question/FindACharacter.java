package junseok.home.question;

public class FindACharacter {

    public int solution(String str, char ch) {

        str = str.toUpperCase();
        var word = Character.toString(ch);
        word = word.toUpperCase();

        /*

         */
        var count = 0;

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
}
