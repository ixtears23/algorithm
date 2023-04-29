package home.junseok.question;

import java.util.*;

public class Wrestler2 {

    public static int solution(List<Person> list) {

        int maxWeight = 0;
        int count = 0;

        for (final Person person : list) {
            if (maxWeight < person.getWeight()) {
                maxWeight = person.getWeight();
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < Integer.parseInt(s); i++) {
            final String[] s2 = scanner.nextLine().split(" ");
            personList.add(new Person(Integer.parseInt(s2[0]), Integer.parseInt(s2[1])));
        }

        Collections.sort(personList);

        System.out.println(solution(personList));
    }

    public static class Person implements Comparable<Person> {
        private int height;
        private int weight;

        public Person(int height, int weight) {
            this.height = height;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public int compareTo(Person p) {
            return Integer.compare(p.height, this.height);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "height=" + height +
                    ", weight=" + weight +
                    '}';
        }
    }
}
