package pl.sda.introductiontasks.tasks3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Stwórz listę i umieść w niej 5 losowych liczb całkowitych.
Stwórz metodę, która jako argument przyjmuje listę i zwraca nową listę,
która posiada jedynie liczby podzielne przez 3 znajdujące się w liście wejściowej.
 */
public class Task3_2 {
    public static void main(String[] args) {
        List<Integer> listToCheck = createRandomList();
        System.out.println(listToCheck);

        System.out.println(createFinalList(listToCheck));
    }

    public static List<Integer> createRandomList() {
        Random random = new Random();
        return random
                .ints(5, 1, 10)
                .boxed()
                .collect(Collectors.toList());
    }

    public static List<Integer> createFinalList(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 3 == 0) {
                result.add(number);
            }
        }
        return result;
    }
}
