package pl.sda.introductiontasks.tasks2;

/*
Stwórz i zainicjuj (losowymi wartościami) tablicę 10 liczb całkowitych.
Znajdź indeks pierwszej liczby nieparzystej. Oblicz sumę elementów do tego indeksu (włączając elementy na tym indeksie do sumy).
 */

import java.util.Arrays;
import java.util.Random;

public class Task2_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int oddNumberIndex = 0;
        int sum = 0;


        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(numbers));


//        int[] numbers = random
//                .ints(10, 1, 20)
//                .toArray();
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            if (numbers[i] % 2 != 0) {
                oddNumberIndex = i;
                break;
            }
        }
        System.out.println("nieparzysty index: " + oddNumberIndex);
        System.out.println("suma: " + sum);
    }
}
