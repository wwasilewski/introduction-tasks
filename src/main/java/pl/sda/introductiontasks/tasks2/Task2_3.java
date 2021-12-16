package pl.sda.introductiontasks.tasks2;

/*
Stwórz metodę, która może przyjąć dowolną ilość argumentów typu String. Niech metoda ta zwraca jeden String,
który jest konkatenacją wszystkich argumentów wejściowych.
Wywołaj tę metodę w metodzie main.
 */
public class Task2_3 {
    public static void main(String[] args) {
        System.out.println(concatStrings("this", "is", "my", " test", " string "));
    }

    public static String concatStrings(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String string : strings) {
            sb.append(string);
        }
        return String.valueOf(sb);
    }
}
