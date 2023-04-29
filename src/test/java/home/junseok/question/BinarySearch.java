package home.junseok.question;

import java.util.*;
import java.util.stream.Collectors;

public class BinarySearch {

    public int solution(int numberToFind, int[] ints) {
        final List<Integer> integerList = Arrays.stream(ints).boxed().sorted().collect(Collectors.toList());
        for (int index = 0 ;index < integerList.size(); index++) if (integerList.get(index) == numberToFind) return ++index;
        return 0;
    }

    public static void main(String[] args) {

        final BinarySearch binarySearch = new BinarySearch();
        final Scanner scanner = new Scanner(System.in);
        final int anyNumber = scanner.nextInt();
        final int numberToFind = scanner.nextInt();

        int[] ints = new int[anyNumber];
        for (int i = 0; i < anyNumber; i++) ints[i] = scanner.nextInt();
        System.out.println(binarySearch.solution(numberToFind, ints));
    }
}
