package pl.sda.introductiontasks.tasks3;

import java.util.HashMap;
import java.util.Map;

/*
Stwórz metodę, która jako argument wejściowy przyjmuje obiekt typu String.
Metoda ta powinna zwracać mapę, której kluczami są Stringi a wartościami liczby całkowite.
Mapa ta zawiera informację, ile razy dane słowo znajduje się w wejściowym zdaniu.
Załóż, że wejściowe zdanie nie zawiera znaków specjalnych (kropka czy przecinek) i wszystkie wyrazy zawierają jedynie małe litery.
*/
public class Task3_4 {
    public static void main(String[] args) {
   /*
    TU UMIEŚĆ SWÓJ KOD
   */
        System.out.println(countOccurences("this is is is my string my string"));
    }

    public static Map<String, Integer> countOccurences(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}
