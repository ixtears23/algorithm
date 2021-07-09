package home.junseok.question;

public class StudentWhoSees {
    public int solution(int input1, String input2) {
        int answer = 0;
        String[] height = input2.split(" ");

        int prevMaxHeight = 0;

        for (int i = 0; i < height.length; i++) {
            if (prevMaxHeight < Integer.parseInt(height[i])) {
                answer++;
                prevMaxHeight = Integer.parseInt(height[i]);
            }
        }

        return answer;
    }
}
