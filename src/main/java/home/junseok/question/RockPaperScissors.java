package home.junseok.question;

public class RockPaperScissors {
    public String solution(int cnt, String input1, String input2) {
        // N번의 게임
        // A이김: A B이김: B 비김: D
        // 1: 가위 2: 바위 3: 보

        // 1 : 3 A
        // 2 : 1 A
        // 3 : 2 A
        // 1 : 2 B
        // 2 : 3 B
        // 3 : 1 B
        String answer = "";
        input1 = input1.replaceAll(" ", "");
        input2 = input2.replaceAll(" ", "");

        for (int i = 0; i < cnt; i++) {
            if ((input1.charAt(i) == '1' && input2.charAt(i) == '3')
                    || (input1.charAt(i) == '2' && input2.charAt(i) == '1')
                    || (input1.charAt(i) == '3' && input2.charAt(i) == '2')
            ) {
                answer += "A";
            } else if (input1.charAt(i) == input2.charAt(i)) {
                answer += "D";
            } else {
                answer += "B";
            }
        }

        return answer;
    }
}
