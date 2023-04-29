package home.junseok.question;

import java.util.*;

public class MeetingRoomAssignment {

    public static class Compare implements Comparator<int[]> {
        @Override
        public int compare(int[] o1, int[] o2) {
            return Integer.compare(o1[0], o2[0]);
        }
    }


    int resultCount = 0;

    public int solution(List<int[]> meetings) {
        meetings.sort(new Compare());

        int count = 0;
        for (int i = 1; i < meetings.size() - 1; i++) {
            final int startTime = meetings.get(i)[0];
            final int endTime = meetings.get(i - 1)[1];
            if (endTime <= startTime) {
                count++;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        final MeetingRoomAssignment meetingRoomAssignment = new MeetingRoomAssignment();
        final Scanner scanner = new Scanner(System.in);
        final int useCount = scanner.nextInt();
        List<int[]> meetings = new ArrayList<>();
        for (int i = 0; i < useCount; i++) {
            final int[] meetingTime = new int[2];
            final int startTime = scanner.nextInt();
            meetingTime[0] = startTime;
            final int endTime = scanner.nextInt();
            meetingTime[1] = endTime;
            meetings.add(meetingTime);
        }

        System.out.println(meetingRoomAssignment.solution(meetings));
    }
}
