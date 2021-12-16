package pl.sda.introductiontasks.tasks3;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/*
Stwórz metodę, która przyjmuje jako argument wejściowy String, a zwraca zbiór, w którym znajdują się liczby reprezentujące długość wyrazów w wejściowym zdaniu.
Wykorzystaj Stream API do wykonania zadania
 */
public class Task3_5 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        System.out.println(countWordsLength("sentence this is this"));
    }

    public static Set<Integer> countWordsLength(String sentence) {
//        Set<Integer> result = new HashSet<>();
//        String[] words = sentence.split(" ");
//
//        for (String word : words) {
//            result.add(word.length());
//        }
//        return result;

        return Arrays.stream(sentence.split(" "))
                .mapToInt(s -> s.length())
                .boxed()
                .collect(Collectors.toSet());
    }
}
