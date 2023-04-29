package home.junseok.programmers;

import java.util.*;
import java.util.stream.Collectors;

/*
    문제 설명
    문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
    예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.

    제한 조건
    s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.


 */
public class 최대값과최솟값 {
    public String solution(String s) {
        final String[] s1 = s.split(" ");
        final List<String> strings = Arrays.asList(s1);
        final List<Integer> integers = strings.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
        final int min = integers.get(0);
        final int max = integers.get(strings.size() - 1);
        return String.format("%s %s", min, max);
    }
}
