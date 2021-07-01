package junseok.home;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            // 정렬되지 않은 배열을 담을 변수
            int[] arr = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = commands[i][0], k = 0; j <= commands[i][1]; j++, k++) {
                arr[k] = array[j - 1];
            }

            // 정렬되지 않은 배열이 담긴 변수(arr) 정렬 [선택정렬]
            for (int x = 0; x < arr.length; x++) {
                int temp = 0;
                for (int y = x + 1; y < arr.length; y++) {
                    if (arr[x] > arr[y]) {
                        temp = arr[y];
                        arr[y] = arr[x];
                        arr[x] = temp;
                    }
                }
            }

            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }
}
