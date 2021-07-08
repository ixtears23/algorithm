package home.junseok.question;

public class ShortestCharacterDistance {
    public int[] solution(String input1, char input2) {
        // teachermode e
        // "1 0 1 2 1 0 1 2 2 1 0"
        int[] answer = new int[input1.length()];

        int p = 101;
        for (int i = 0; i < input1.length(); i++) {
            if (input1.charAt(i) == input2) {
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 101;
        for (int i = input1.length() - 1; i >=  0; i--) {
            if (input1.charAt(i) == input2) {
                p = 0;
            } else {
                p++;
            }

            if (answer[i] > p) {
                answer[i] = p;
            }
        }

        return answer;
    }
}
